//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String temp = arr[0];
        for(int i = 0;i<n;i++){
            if(temp.length() > arr[i].length()){
                temp = arr[i];
            }
        }
        int f = 0;
        int ans = 0;
        
        for(int i = 0;i<temp.length();i++){
            char ch = temp.charAt(i);
            for(int j = 0;j<n;j++){
                if(ch != arr[j].charAt(i)){
                    f = 1;
                    break;
                }
                
            }
            if(f == 0){
                ans++;
                
            }
            else{
                break;
            }
            
            
            
        }
        if(ans==0){
            return "-1";
            
        }
        return temp.substring(0,ans);
    }
}