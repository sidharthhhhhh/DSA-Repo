//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node head ;
    static Node tail ;
    
    
    static int solveAdd(Node first,int pv1,Node second,int pv2){
        
        head = tail = null;
        
        if(first == null && second == null){
            return 0;
        }
        
        int data = 0;
        
        if(pv1 > pv2){
            int oc  = solveAdd(first.next,pv1 - 1 ,second,pv2);
            data = first.data +oc;
        }
        else if(pv1 < pv2){
            int oc  = solveAdd(first,pv1,second.next,pv2-1);
            data = second.data +oc;
        }
        else{
            int oc  = solveAdd(first.next,pv1 - 1 ,second.next,pv2 - 1);
            
            data = first.data + second.data +oc;
            
            
        }
        int nd = data%10;
        int nc = data/10;
        
        Node temp = new Node(nd);
        if(head == null){
            head = tail =  temp;
            tail.next = null;
        }
        else{
            temp.next = head;
            head  =temp;
        }
        
        return nc;
        
    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        // Node head;
        // Node tail;
        Node temp = first;
        int fs = 0;
        int ss = 0;
        
        
        while(temp != null){
            fs++;
            temp = temp.next;
        }
        
        temp = second;
        while(temp != null){
            ss++;
            temp = temp.next;
        }
       
        int oc = solveAdd(first,fs,second,ss);
        if(oc>0){
            
            Node t = new Node(oc);
        
            t.next = head;
            head  =t;
        
        }
        
        return head;
        
    }
}