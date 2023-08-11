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
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> ans  = new ArrayList<ArrayList<Integer>>();
        HashMap<ArrayList<Integer>,Boolean> hm = new HashMap<>();
        Arrays.sort(arr);
        
        for(int i = 0;i<arr.length - 3;i++){
            for(int j = i+1;j<arr.length-2;j++){
                int temp = arr[i]+arr[j];
                int left = j+1;
                int right = arr.length-1;
                // ArrayList<Integer> tarr = new ArrayList<>();
                
                while(left < right){
                    
                    int t = arr[left] + arr[right];
                    if(temp+ t == k){
                        ArrayList<Integer> tarr = new ArrayList<>();
                        tarr.add(arr[i]);
                        tarr.add(arr[j]);
                        tarr.add(arr[left]);
                        tarr.add(arr[right]);
                        
                        
                        if(!hm.containsKey(tarr)){
                            ans.add(tarr);
                            hm.put(tarr,true);
                        }
                        
                        left++;
                        right--;
                        
                        
                    }
                    else if(temp+t > k){
                        right--;
                        
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        
        
        return ans;
    }
}