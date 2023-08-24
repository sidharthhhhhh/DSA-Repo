//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

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

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends




//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    // static ArrayList<Node> addNode(Node find,Node head,Node tail , int t){
        
    //     Node temp = find;
    //     ArrayList<Node> arr = new ArrayList<>();
    //     while(temp != null){
    //         if(temp.data == t){
                
    //             if(head == null){
    //                 head = tail = temp;
    //             }
    //             else{
    //                 tail.next = temp;
    //                 tail = temp;
    //             }
    //         }
    //         temp = temp.next;
    //     }
        
    //     arr.add(head);
    //     arr.add(tail);
        
        
    //     return arr;
        
        
        
    // }
    static Node segregate(Node head)
    {
        // add your code here
        Node zh,zt;
        Node oh,ot;
        Node th,tt;
        
        zh = zt = oh = ot = th = tt = null;
       
        Node temp = head;
        
        
        while(temp !=null){
            
            if(temp.data == 0){
                if(zt == null){
                    zh = zt = temp;
                }
                else{
                    zt.next = temp;
                    zt = temp;
                }
            }
            else if(temp.data == 1){
                if(ot == null){
                    oh = ot = temp;
                }
                else{
                    ot.next = temp;
                    ot = temp;
                }
            }
            else if(temp.data == 2){
                if(tt == null){
                    th = tt = temp;
                }
                else{
                    tt.next = temp;
                    tt = temp;
                }
                
            }
            temp = temp.next;
            
        }
        if(zh == null && oh != null && th != null ){
            ot.next = th;
            tt.next = null;
            return oh;
        }
        else if(oh == null && zh != null && th != null){
            zt.next = th;
            tt.next = null;
            return zh;
        }
        else if(th == null && zh != null && oh != null){
            zt.next = oh;
            ot.next = null;
            return zh;
        }
        else if(th == null && zh != null && oh == null){
            
            return zh;
        }
        else if(th == null && zh == null && oh != null){
            
            return oh;
        }
        else if(oh == null && zh == null && th != null){
            
            return th;
        }
        
        else{
            zt.next = oh;
            ot.next = th;
            tt.next = null;
            return zh;
        }
        // Node h,t;
        // h = t = null;
        
        // ArrayList<Node> arr = addNode(head,h,t,0);
        // arr = addNode(head,arr.get(0),arr.get(1),1);
        // arr =  addNode(head,arr.get(0),arr.get(1),2);
        // arr.get(1).next = null;
        // return arr.get(0);
        
        
    }
}


