//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int n) {
        // code here
        int mod = 1000000007; 
        long[] zero = new long[n+1];
        long[] one = new long[n+1];
        zero[1] = 1;
        one[1] = 1;
        
        for(int i = 2;i<=n;i++){
            zero[i] = (zero[i-1] + one[i-1]) % mod;
            one[i] = zero[i-1] % mod;
        }
        return (one[n]+zero[n]) % mod;
    }
}