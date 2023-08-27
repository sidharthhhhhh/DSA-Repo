//{ Driver Code Starts
/* package whatever; // don't place package name! */
import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class Remove_Duplicate_From_LL
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        GfG g = new GfG();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }}
// } Driver Code Ends




/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	    // Your code here
	   if(head.next == null){
	       return head;
	   }
	   Node ansh,anst;
	   ansh = null;
	   anst = null;
	   
	   while(head.next.next != null){
	       
	       if(head.data != head.next.data){
	           Node temp = new Node(head.data);
	           if(ansh == null){
	               ansh = anst = temp;
	           }
	           else{
	               anst.next = temp;
	               anst = temp;
	               
	           }
	       }
	       head = head.next;
	       
	   }
	   if(head.data != head.next.data){
	           Node temp = new Node(head.data);
	           Node temp2 = new Node(head.next.data);
	           if(ansh == null){
	               ansh = anst = temp;
	               anst.next = temp2;
	               anst = temp2;
	           }
	           else{
	               anst.next = temp;
	               temp.next = temp2;
	               anst = temp;
	               
	           }
	   }
	   else{
	       
	           Node temp = new Node(head.data);
	           if(ansh == null){
	               ansh = anst = temp;
	           }
	           else{
	               anst.next = temp;
	               anst = temp;
	               
	           }
	       
	       
	   }
	   
	   return ansh;
	
    }
}
