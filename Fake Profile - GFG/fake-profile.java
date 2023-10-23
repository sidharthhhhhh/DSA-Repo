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
                    String a = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.solve(a));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String solve(String a)
    {
        //code here
        HashMap<Character,Integer> hm = new HashMap<>();
        int count = 0;
        String vow = "aeiou";
        for(int i = 0;i<a.length();i++){
            char ch = a.charAt(i);
            if(!vow.contains(String.valueOf(ch))){
                hm.put(ch,0);
            }
        }
        if(hm.size()%2 != 0){
            return "HE!";    
        }
        return "SHE!";
    }
}