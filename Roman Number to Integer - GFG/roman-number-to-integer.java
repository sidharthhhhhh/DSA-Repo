//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer> hm = new HashMap<>();
        
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int ans = 0;
        int i = str.length()-1;
        while(i>=0){
            char v = str.charAt(i);
            
            if(v == 'V' || v == 'X'){
                if(i > 0 && str.charAt(i-1) == 'I' && v == 'V'){
                    ans += 4;
                    i-=2;
                }
                else if(i > 0 && str.charAt(i-1) == 'I' && v == 'X'){
                    ans += 9;
                    i-=2;
                }
                else{
                    ans += hm.get(v);
                    i--;
                }
            }
            else if(v == 'L' || v == 'C'){
                if(i > 0 && str.charAt(i-1) == 'X' && v == 'L'){
                    ans += 40;
                    i-=2;
                }
                else if(i > 0 && str.charAt(i-1) == 'X' && v == 'C'){
                    ans += 90;
                    i-=2;
                }
                else{
                    ans += hm.get(v);
                    i--;
                }
            }
            else if(v == 'D' || v == 'M'){
                if(i > 0 && str.charAt(i-1) == 'C' && v == 'D'){
                    ans += 400;
                    i-=2;
                }
                else if(i > 0 && str.charAt(i-1) == 'C' && v == 'M'){
                    ans += 900;
                    i-=2;
                }
                else{
                    ans += hm.get(v);
                    i--;
                }
            }
            else{
                ans += hm.get(v);
                i--;
            }
        }
        return ans;
    }
}