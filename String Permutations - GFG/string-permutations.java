//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends




//User function Template for Java


class Solution
{
    static ArrayList<String> fpermut(ArrayList<String> ans,String ques,String asf){
        if(ques.length() == 0){
            ans.add(asf);
            return ans;
        }
        for(int i = 0;i<ques.length();i++){
            char ch = ques.charAt(i);
            String lp = ques.substring(0,i);
            String rp = ques.substring(i+1);
            
            String up = lp+rp;
            
            fpermut(ans,up,asf+ch);
            
        }
        
        
        return ans;
    }
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> ans = new ArrayList<>();
        
        ArrayList<String> fans = fpermut(ans,S,"");
        
        Collections.sort(fans);
        return fans;
    }
	   
}
