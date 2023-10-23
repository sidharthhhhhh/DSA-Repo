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
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    // public String rev(String s){
    //     String ans = "";
        
    //     for(int i = 0;i<s.length();i++){
    //         ans  = s.charAt(i) + ans;
    //     }
    //     return ans;
    // }
   
    public String reverseWords(String S)
    {
        // your code here
        String ans = "";
        String t = "";
        for(int i = S.length()-1;i>=0;i--){
            char ch = S.charAt(i);
            if(ch == '.'){
                ans = "."+ t + ans;
            
                t = "";
            }
            else{
                t += ch;
            }
        }
        ans = t+ ans;;
        
        // Stack<String> st = new Stack<>();
        // String t = "";
        // for(int i = S.length()-1;i>=0;i--){
        //     char ch = S.charAt(i);
        //     if(ch == '.'){
        //         st.push(t);
        //         st.push(".");
        //         t = "";
        //     }
        //     else{
        //         t += ch;
        //     }
        // }
        // st.push(t);
        
        
        // String ans = "";
        
        // while(st.size()>0){
        //     ans += st.pop();
        // }
        // String[] arr = n.split("[.]");
        
        // String ans = "";
        
        // for(int i = arr.length  -1;i>=0;i--){
            
        //     if( i == 0){
        //         ans += arr[i];
        //     }
        //     else{
        //         ans += arr[i] + '.';
        //     }
            
        // }
        return ans;
        
    }
}