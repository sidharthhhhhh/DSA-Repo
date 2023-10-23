//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String,Integer> hm = new HashMap<>();
        
        for(String s : arr){
            
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        int maxf = 0;
        int maxs = 0;
        String f = "";
        String se = "";
        
        for(String s : hm.keySet()){
            if(hm.get(s) > maxf){
                maxs = maxf;
                se = f;
                maxf = hm.get(s);
                f = s;
                
            }
            else if(hm.get(s) > maxs && hm.get(s) != maxf){
                maxs = hm.get(s);
                se = s;
                
                
            }
        }
        return se;
        
        
        
        
    }
}