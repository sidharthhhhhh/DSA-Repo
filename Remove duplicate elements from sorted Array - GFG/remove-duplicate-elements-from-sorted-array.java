//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for(int i=0; i<N; i++)
                a[i] = sc.nextInt();
            
            Solution g = new Solution();
            int n = g.remove_duplicate(a,N);
            
            for(int i=0; i<n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
            T--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        if(N == 1){
            return N;
        }
        int count = 0;
        int p = 0;
        int[] ans = new int[A.length];
        
        for(int i = 0;i<A.length-1;i++){
            if(A[i] != A[i+1]){
                count++;
                ans[p] = A[i];
                p++;
                if(i == A.length - 2){
                    ans[p] = A[i+1];
                    count++;
                }
            }
            else{
                if(i == A.length - 2){
                    count++;
                    ans[p] = A[i];
                }
            }
            
        }
        for(int i = 0;i<ans.length;i++){
            A[i] = ans[i];
        }
        return count;
    }
}