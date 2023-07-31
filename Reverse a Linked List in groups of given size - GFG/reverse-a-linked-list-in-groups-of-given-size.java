//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res,out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node node,PrintWriter out)
    {
        while(node != null)
        {
            out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node prevh;
        Node prevt;
        
        Node currh;
        Node currt;
        int s = 0;
        
        prevh = prevt = currh = currt =  null;
        
        Node temp = node;
        
        while(temp != null){
            Node t = new Node(temp.data);
            if(currh == null){
                currh = currt = t;
                // currt.next = null;
                s++;
            }
            else{
                t.next = currh;
                currh = t;
                s++;
                
            }
            if(s == k){
                if(prevh == null){
                    prevh = currh;
                    prevt = currt;
                    
                    currh = currt = null;
                    s = 0;
                }
                else{
                    prevt.next = currh;
                    prevt = currt;
                    
                    currh = currt = null;
                    s = 0;
                    
                    
                }
            }
            if(temp.next == null && s < k){
                prevt.next = currh;
                prevt = currt;
               
                return prevh;
                
            }
            temp = temp.next;
            
        }
        return prevh;
    }
}

