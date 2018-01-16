    #include <bits/stdc++.h>
    using namespace std;
    int main()
    {
        ios::sync_with_stdio(false);
        int t;
        cin >> t;
        while(t--)
        {
            int a1,a2,n,mod;
            cin >> a1 >> a2 >> n >> mod;
            long a[n];
            a[0] = a1;
            a[1] = a2;
            for(int i=2;i<n;i++)
            {
                a[i] = ((a[i-1]%mod)+(a[i-2]%mod))%mod;
            }
            long count[mod] = {0};
            for(int i=0;i<n;i++)
            {
                count[a[i]]++;
            }
            long ans = 0;
            for(int i=0;i<mod;i++)
            {
                ans += count[i]*count[i];
            }
            cout << ans << "\n";
        }
        return 0;
    }
Language: C++