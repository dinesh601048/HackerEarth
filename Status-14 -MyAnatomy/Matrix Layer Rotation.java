import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static int[][] matrix;

static int R;

static int layer;

public static void Rotate(int h, int w){  //width and height

    Queue<Integer> temp = new LinkedList<Integer>();     //shifting and replacing back into real matrix

    for(int i = 0+layer; i < w-1-layer; i++){
        temp.add(matrix[0+layer][i]);
    }
    for(int i = 0+layer; i < h-1-layer; i++){
        temp.add(matrix[i][w-1-layer]);
    }
    for(int i = w-1-layer; i > 0+layer; i--){
        temp.add(matrix[h-1-layer][i]);
    }
    for(int i = h-1-layer; i > 0+layer; i--){
        temp.add(matrix[i][0+layer]);
    }
    int redo = R;

    if((2*(h-layer*2) + 2*(w-layer*2) - 4) > 0){     
        redo = R%(2*(h-layer*2) + 2*(w-layer*2) - 4);    
    }

    //doing the shifting
    
    int t;
    for(int i = 0; i < redo; i++){
        t = temp.poll();
        temp.add(t);
    }

    //putting queue contents back into the matrix

    for(int i = 0+layer; i < w-1-layer; i++){                 
        matrix[0+layer][i] = temp.poll();
    }
    for(int i = 0+layer; i < h-1-layer; i++){
        matrix[i][w-1-layer] = temp.poll();
    }
    for(int i = w-1-layer; i > 0+layer; i--){
        matrix[h-1-layer][i] = temp.poll();
    }
    for(int i = h-1-layer; i > 0+layer; i--){
        matrix[i][0+layer] = temp.poll();
    }

    //inner layers

    if(layer < w/2-1 && layer < h/2-1){  //if there are more layers to be rotated, recursive call 
        layer++;
        Rotate(h,w);
    }

}

public static void main(String[] args) {
    layer = 0;
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt(); 
    int N = sc.nextInt();
    R = sc.nextInt(); sc.nextLine();
    matrix = new int[M][N];

    for(int y = 0; y < M; y++){
        for(int x = 0; x < N; x++){
            matrix[y][x] = sc.nextInt();
        }
        if(y == M-1) break;
        sc.nextLine();
    }

    Rotate(M,N);

    printMatrix(M,N);
}

public static void printMatrix(int h, int w){          
    for(int y = 0; y < h; y++){
        for(int x = 0; x < w; x++){
            System.out.print(matrix[y][x]+" ");
        }
        System.out.println();
    }
  }
}
