 
    /* IMPORTANT: Multiple classes and nested static classes are supported */
     
    /*
     * uncomment this if you want to read input.
    //imports for BufferedReader
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
     
    //import for Scanner and other utility  classes
    */
    import java.util.*;
     
     
    class TestClass {
        
        static class Entry {
    		int rowValue, columnValue;
     
    		public Entry(int row, int column) {
    			this.rowValue = row;
    			this.columnValue = column;
    		}
    	}
    	
    	
        public static void main(String args[] ) throws Exception {
            //Scanner
            Scanner scanner = new Scanner(System.in);
    		int numberOfRows = scanner.nextInt();
    		int numberOfColumns = scanner.nextInt();
     
    		Queue<Entry> queue = new LinkedList<>();
    		int[][] arr = new int[numberOfRows][numberOfColumns];
    		boolean[][] dp = new boolean[numberOfRows][numberOfColumns];
     
    		for (int i = 0; i < numberOfRows; i++) {
    			for (int j = 0; j < numberOfColumns; j++) {
    				int x = scanner.nextInt();
    				arr[i][j] = x;
    				if (x == 2) {
    					dp[i][j] = true;
    					queue.add(new Entry(i, j));
    				} else if (x == 0) {
    					dp[i][j] = true;
    				} else {
    					dp[i][j] = false;
    				}
    			}
    		}
    		int count = 0;
    		queue.add(new Entry(-1, -1));
    		while (!queue.isEmpty()) {
    			Entry obj = queue.poll();
    			if (obj.rowValue == -1 && obj.columnValue == -1) {
    				if (!queue.isEmpty()) {
    					queue.add(new Entry(-1, -1));
    					count++;
    					//System.out.println(count);
    				}
    			} else {
    				int i = obj.rowValue;
    				int j = obj.columnValue;
    				if (i - 1 >= 0 && j >= 0 && arr[i - 1][j] == 1 && dp[i - 1][j] == false) {
    					queue.add(new Entry(i - 1, j));
    					dp[i - 1][j] = true;
    				}
    				if (i >= 0 && j - 1 >= 0 && arr[i][j - 1] == 1 && dp[i][j - 1] == false) {
    					queue.add(new Entry(i, j - 1));
    					dp[i][j - 1] = true;
    				}
    				//
    				if (i + 1 >= 0 && i + 1 < numberOfRows && j >= 0 && arr[i + 1][j] == 1 && dp[i + 1][j] == false) {
    					queue.add(new Entry(i + 1, j));
    					dp[i + 1][j] = true;
    				}
    				if (i >= 0 && j + 1 >= 0 && j + 1 < numberOfColumns && arr[i][j + 1] == 1 && dp[i][j + 1] == false) {
    					queue.add(new Entry(i, j + 1));
    					dp[i][j + 1] = true;
    				}
    				//
    			}
    		}
    		for (int i = 0; i < numberOfRows; i++) {
    			for (int j = 0; j < numberOfColumns; j++) {
    				if (dp[i][j] == false) {
    					count = -1;
    				}
    			}
    		}
    		System.out.println(count);
        }
    }
 
Language: Java 8