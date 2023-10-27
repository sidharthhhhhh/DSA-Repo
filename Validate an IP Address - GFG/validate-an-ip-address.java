//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        int c=  0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '.'){
                c++;
            }
        }
        if(c != 3){
            return false;
        }
        String[] arr = s.split("[.]",0);
        
        if(arr.length != 4){
            return false;
        }
        // for(String v : arr){
        //     System.out.println(v);
        // }
        
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i].length() == 0){
                return false;
            }
            if(arr[i].charAt(0) == '0' && arr[i].length() > 1){
                return false;
                
            }
            // if(arr[i].length() > 3){
            //     return false;
            // }
            for(int j = 0;j<arr[i].length();j++){
                if(!Character.isDigit(arr[i].charAt(j))){
                    return false;
                }
            }
            if(Integer.parseInt(arr[i]) > 255){
                return false;
            }
        }
        return true;
        
    }
}