//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long[] arr = new long[n];
        long prod = 1;
        int z = 0;
        for(int i  = 0;i<n;i++){
            if(nums[i] == 0){
                z++;
                continue;
            }
            prod *= nums[i];
        }
        
        if(z == 1){
            int p = 0;
            for(int i : nums){
                if(i == 0){
                    arr[p] = prod;
                }
                else{
                    arr[p]=  0;
                }
                p++;
            }
            return arr;
           
        }
        if(z > 1){
            return arr;
        }
        int p = 0;
        for(int i : nums){
            arr[p] = prod/i;
            p++;
        }
        return arr;
	} 
} 
