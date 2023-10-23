//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.ReverseSort(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String ReverseSort(String str) 
    { 
        // code here
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int i = 0;
        int j = str.length()-1;
        while(i < j){
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        String ans = new String(arr);
        return ans;
    }
} 