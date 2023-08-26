//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class GfG
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
        {
            
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n , m;
                    
                    n = sc.nextInt();
                    m = sc.nextInt();
                    
                    Node head1 = inputList(n);
                    Node head2 = inputList(m);
                    
                    Sol obj = new Sol();
                    
                    Node result = obj.findIntersection(head1, head2);
	    
	                printList(result);
	                System.out.println();
                }
        }
}
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        HashMap<Integer,Integer> hm = new HashMap<>();
        while(head1 != null){
            if(!hm.containsKey(head1.data)){
                hm.put(head1.data,1);
            }
            else{
                hm.put(head1.data,hm.get(head1.data) + 1);
            }
            head1 = head1.next;
        }
        
        Node ansh,anst;
        ansh = anst = null;
        
        while(head2 != null){
            Node temp = new Node(head2.data);
            if(hm.containsKey(head2.data)){
                
                if(hm.get(head2.data) > 0){
                
                    if(ansh == null){
                        ansh = anst = temp;
                        hm.put(head2.data,hm.get(head2.data)-1);
                    }
                    else{
                        anst.next = temp;
                        anst = temp;
                        hm.put(head2.data,hm.get(head2.data)-1);
                    }
                }
            }
            head2 = head2.next;
        }
        return ansh;
    }
}