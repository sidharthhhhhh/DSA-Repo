//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    
	    int maxr = n-1;
	    int maxc = m-1;
	    int minr = 0;
	    int minc = 0;
	    
	    int count = 0;
	    int size = n*m;
	    
	    while(count <= size){
	        for(int i = minr,j = minc;j<=maxc;j++){
	            count++;
	            if(count == k){
	                return a[i][j];
	            }
	        }
	        minr++;
	        
	        for(int i = minr,j = maxc;i<=maxr;i++){
	            count++;
	            if(count == k){
	                return a[i][j];
	            }
	        }
	        maxc--;
	        
	        for(int i = maxr,j = maxc;j>=minc;j--){
	            count++;
	            if(count == k){
	                return a[i][j];
	            }
	        }
	        maxr--;
	        
	        for(int i = maxr,j = minc;i >= minr ;i--){
	            count++;
	            if(count == k){
	                return a[i][j];
	            }
	        }
	        minc++;
	        
	    }
	    return -1;
	    
	}
	
}