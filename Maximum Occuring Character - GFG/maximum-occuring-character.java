//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code her
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] arr = line.toCharArray();
        Arrays.sort(arr);
        for(char ch : arr){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int max = 0;
        char me = ' ';
        
        for(char ch  : arr){
            if(hm.get(ch) > max){
                max = hm.get(ch);
                me = ch;
            }
            
        }
        return me;
    }
    
}