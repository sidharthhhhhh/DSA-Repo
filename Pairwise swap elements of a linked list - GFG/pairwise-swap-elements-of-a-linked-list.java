//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
        	int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node tail = head;
            HashMap<Node, Integer> mp = new HashMap<Node, Integer>();
            mp.put(head, head.data); 
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
                mp.put(tail, tail.data); 
            }
            
            Node failure = new Node(-1);
            
            Solution g = new Solution();
            head = g.pairwiseSwap(head);
            
            Node temp = head;
            int f = 0;
            while (temp != null) 
    		{ 
    			if(mp.get(temp) != temp.data){
    			    f = 1;
    			}
    			temp = temp.next; 
    		} 
            
            if(f==1){
                printList(failure); 
            }
            else{
                printList(head); 
            }
            t--;
        }
    } 
} 
   

// } Driver Code Ends




/* node class of the linked list

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


class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head.next == null){
            return head;
        }
        if(head.next.next == null){
            Node t = head.next;
            t.next = head;
            head.next= null;
            head = t;
            return head;
        }
        Node temp = head;
        temp = temp.next;
        
        head.next = head.next.next;
        temp.next = head;
        head = temp;
        temp = temp.next;
        while(temp.next.next != null){
            if(temp.next.next.next == null){
                Node t = temp.next;
                temp.next = t.next;
                t.next = null;
                temp = temp.next;
                temp.next = t;
                break;
                
            }
            Node t = temp.next;
            temp.next = temp.next.next;
            t.next = t.next.next;
            temp = temp.next;
            temp.next = t;
            temp = temp.next;
        }
        return head;
        
    }
}