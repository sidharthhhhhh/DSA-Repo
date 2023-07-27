//{ Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}


class MergeLists
{
    Node head;



  /* Function to print linked list */
   public static void printList(Node head)
    {
        
        while (head!= null)
        {
           System.out.print(head.data+" ");
           head = head.next;
        }  
        System.out.println();
    }
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			Node head1 = new Node(sc.nextInt());
            Node tail1 = head1;
            for(int i=0; i<n1-1; i++)
            {
                tail1.next = new Node(sc.nextInt());
                tail1 = tail1.next;
            }
			Node head2 = new Node(sc.nextInt());
            Node tail2 = head2;
            for(int i=0; i<n2-1; i++)
            {
                tail2.next = new Node(sc.nextInt());
                tail2 = tail2.next;
            }
			
			LinkedList obj = new LinkedList();
			Node head = obj.sortedMerge(head1,head2);
			printList(head);
			
			t--;
			
         }
    }
}

// } Driver Code Ends


/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
	    Node p1 = head1;
	    Node p2 = head2;
	    
	    Node head;
	    Node h;
	    head = h = null;
	    
	   // if(p1.data < p2.data){
	   //     Node temp = new Node(p1.data);
	   //     head = h= temp;
	   //     h.next = null;
	        
	       
	        
	   //     p1 = p1.next;
	   // }
	   // else{
	   //     Node temp = new Node(p2.data);
	   //     head = h = temp;
	   //     h.
	       
	   //     h.next = null;
	   //     p2 = p2.next;
	   // }
	    
	   // Node head = new Node();
	   // head = null;
	   // if(p1.data > p2.data){
	        
	        
	   // }
	    
	    while(p1 != null && p2 != null){
	        if(p1.data < p2.data){
	            Node temp = new Node(p1.data);
	            if(h == null){
	                head = h = temp;
	            }
	            else{
	                h.next = temp;
	                h = temp;
	                
	            }
	            p1 = p1.next;
	            
	        }
	        else{
	            Node temp = new Node(p2.data);
	            if(head == null){
	                head = h = temp;
	            }
	            else{
	                h.next = temp;
	                h = temp;
	                
	            }
	            p2 = p2.next;
	            
	            
	        }
	    }
	    while(p1 != null){
	        Node temp = new Node(p1.data);
	            
	            
	                h.next = temp;
	                h = temp;
	                
	            
	            p1 = p1.next;
	        
	    }
	    while(p2 != null){
	        Node temp = new Node(p2.data);
	            
	            
	                h.next = temp;
	                h = temp;
	                
	            
	            p2 = p2.next;
	        
	    }
	    
	    return head;
    } 
}
