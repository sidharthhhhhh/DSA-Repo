//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


class Merge_2_sorted_ll_In_ReverseOrder
{
    Node head;

    void addToTheLast(Node node)
    {
        if(head == null)
            head = node;
        else
        {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    void printList(Node node)
    {
        while(node!= null)
        {
            System.out.print(node.data+ " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String args[]) throws IOException
    {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0)
        {
            String nums[] = br.readLine().split(" ");
            int n1 = Integer.parseInt(nums[0]);
            int n2 = Integer.parseInt(nums[1]);
            Merge_2_sorted_ll_In_ReverseOrder list = new Merge_2_sorted_ll_In_ReverseOrder();
            nums = br.readLine().split(" ");
            int a1 = Integer.parseInt(nums[0]);
            Node head = new Node(a1);
            list.addToTheLast(head);
            for(int i=1;i<n1;i++)
            {
                int a = Integer.parseInt(nums[i]);
                list.addToTheLast(new Node(a));
            }
            //list.printList(list.head);

            Merge_2_sorted_ll_In_ReverseOrder list2 = new Merge_2_sorted_ll_In_ReverseOrder();
            nums = br.readLine().split(" ");
            int b1 = Integer.parseInt(nums[0]);
            Node head1 = new Node(b1);
            list2.addToTheLast(new Node(b1));
            for(int j=1;j<n2;j++)
            {
                int b = Integer.parseInt(nums[j]);
                list2.addToTheLast(new Node(b));				
            }
            //list.printList(list2.head);
            
            GfG g = new GfG();
            Node result = g.mergeResult(list.head, list2.head);
            list.printList(result);
            t--;
        }
    }
}
// } Driver Code Ends


/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	// Your code here
	    Node p1 = node1;
	    Node p2 = node2;
	    
	   // Node head;
	    Node h;
	    h = null;
	    
	    while(p1 != null && p2 != null){
	        if(p1.data < p2.data){
	            Node temp = new Node(p1.data);
	            if(h == null){
	                h =  temp;
	            }
	            else{
	                temp.next = h;
	                h = temp;
	                
	            }
	            p1 = p1.next;
	            
	        }
	        else{
	            Node temp = new Node(p2.data);
	            if(h == null){
	                h  =temp;
	            }
	            else{
	                temp.next = h;
	                h = temp;
	                
	            }
	            p2 = p2.next;
	            
	        }
	    }
	    
	    while(p1 != null){
	        Node temp = new Node(p1.data);
	            
	                temp.next = h;
	                h = temp;
	                
	            
	            p1 = p1.next;
	    }
	    while(p2 != null){
	        Node temp = new Node(p2.data);
	            
	                temp.next = h;
	                h = temp;
	                
	            
	            p2 = p2.next;
	    }
	    
	    return h;
	
    }
}
