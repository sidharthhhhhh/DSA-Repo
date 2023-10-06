//{ Driver Code Starts
import java.util.*;
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

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
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
}*/
class Solution
{
    public static void rearrange(Node odd)
    {
        // add your code here
        if(odd == null || odd.next == null || odd.next.next == null){
            return;
        }
        Node temph,tempt;
        temph = tempt = null;
    
        Node t = odd.next;
        temph = tempt = t;
        odd.next = odd.next.next;
        Node p = t.next;
        t = t.next.next;
        
        
        
        while(t.next != null && t.next.next != null ){
            
            
            tempt.next = t;
            tempt = t;
            t = t.next.next;
            p.next = p.next.next;
            p = p.next;
         
        }
        if(t.next == null){
            p.next = null;
            tempt.next = t;
            tempt = t;
        }
        else{
            p.next = p.next.next;
             tempt.next = t;
            tempt = t;
            t.next = null;
            p = p.next;
            
        }
        t = odd;
        Node n = temph;
        while(n != null){
            Node te = n;
            n = n.next;
            te.next = t;
            t = te;
            
        }
        // while(tempt != null){
        //     System.out.println(tempt.data);
        //     tempt = tempt.next;
            
        // }
        
        p.next = tempt;
        temph.next = null;
    
        
        // while(odd != null){
        //     System.out.println(odd.data);
        //     odd = odd.next;
            
            
        // }
    
    }
}
