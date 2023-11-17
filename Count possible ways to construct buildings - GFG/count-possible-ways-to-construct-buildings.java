//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int TotalWays(int N)
    {
        // Code here
        int mod = 1000000007; 
        

        int zero = 1;
        int one = 1;
        
        for(int i = 2;i<=N;i++){
            int t = one;
            one = zero % mod;
            zero = (t+zero)%mod;
        }
        
        long ans = (one+zero) % mod;
        ans = (ans*ans) %mod;
        return (int)ans;
    }
}