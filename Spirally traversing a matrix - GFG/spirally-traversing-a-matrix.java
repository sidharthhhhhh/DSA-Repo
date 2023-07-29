//{ Driver Code Starts
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
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<>();
        
        int size = r*c;
        int count= 0;
        
        int minr = 0;
        int minc = 0;
        int maxr = r;
        int maxc = c;
        
        while(count != size){
            for(int i = minr,j = minc;j<maxc && count <size;j++){
                ans.add(matrix[i][j]);
                count++;
            }
            minr++;
            
            for(int i = minr,j = maxc-1;i<maxr && count < size;i++){
                ans.add(matrix[i][j]);
                count++;
            }
            maxc--;
            
            for(int i = maxr-1,j = maxc-1;j>= minc && count < size;j--){
                ans.add(matrix[i][j]);
                count++;
            }
            maxr--;
            
            for(int i = maxr-1,j = minc;i>=minr && count < size;i--){
                ans.add(matrix[i][j]);
                count++;
            }
            minc++;
            
        }
        return ans;
        
    }
}
