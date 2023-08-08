//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[10000];
        
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            solver x = new solver();
            int res[]=x.print_next_greater_freq(arr,n);
            StringBuffer sb=new StringBuffer("");
            for(int i : res){
                sb.append(i+" ");
            }
            System.out.println(sb);
        }
    }
}

// } Driver Code Ends


class solver
{
    static int[] print_next_greater_freq(int arr[], int n)
    {
        int[] freq = new int[n];
        int[] ans = new int[n];
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stc = new Stack<>();
        
        
        for(int i = 0;i<n;i++){
            if(hm.containsKey(arr[i])){
               hm.put(arr[i],hm.get(arr[i]) + 1); 
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int i = 0;i<n;i++){
            freq[i] = hm.get(arr[i]);
        }
        ans[n-1] = -1;
        st.push(freq[n-1]);
        stc.push(arr[n-1]);
        
        
        for(int i = n-2;i>=0;i--){
            
                while(st.size()>0 && freq[i] >= st.peek()){
                    st.pop();
                    stc.pop();
                }
                if(st.size() == 0){
                    ans[i] = -1;
                }
                else{
                    ans[i] = stc.peek();
                    
                    
                    
                }
                st.push(freq[i]);
                stc.push(arr[i]);
            
        }
        return ans;
        
        
        
    }
}

