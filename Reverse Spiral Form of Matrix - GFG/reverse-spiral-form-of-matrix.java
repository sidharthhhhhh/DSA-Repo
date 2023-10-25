//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        int maxr = R-1;
	    int maxc = C-1;
	    int minr = 0;
	    int minc = 0;
	    
	    int count = 0;
	    int size = R*C;
	    int[] ans = new int[size];
	    int p = size-1;
	    
	    while(p >=0){
	        for(int i = minr,j = minc;j<=maxc && p>=0;j++){
	            ans[p] = a[i][j];
	            p--;
	        }
	        minr++;
	        
	        for(int i = minr,j = maxc;i<=maxr && p>=0;i++){
	            ans[p] = a[i][j];
	            p--;
	        }
	        maxc--;
	        
	        for(int i = maxr,j = maxc;j>=minc && p>=0;j--){
	            ans[p] = a[i][j];
	            p--;
	        }
	        maxr--;
	        
	        for(int i = maxr,j = minc;i >= minr && p>=0 ;i--){
	            ans[p] = a[i][j];
	            p--;
	        }
	        minc++;
	        
	    }
	    return ans;
    }
}