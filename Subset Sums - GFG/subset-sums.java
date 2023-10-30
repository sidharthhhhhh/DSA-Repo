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
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int lim = (int)Math.pow(2,N);
        
        for(int i = 0;i<lim;i++){
            int t =i;
            int sum = 0;
            for(int j = N-1;j>=0;j--){
                int r = t % 2;
                t /= 2;
                
                if(r == 1){
                    sum += arr.get(j);
                }
                
            }
            ans.add(sum);
        }
        return ans;
    }
}