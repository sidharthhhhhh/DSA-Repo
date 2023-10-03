//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s){
        String t = "";
        int n = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                n += ch -'0';
            }
            else{
                t += ch;
            }
        }
        
        
        char[] ca = t.toCharArray();
        Arrays.sort(ca);
        if(n == 0){
            return new String(ca);
        }
        return new String(ca)+ n;
    }
    
}
