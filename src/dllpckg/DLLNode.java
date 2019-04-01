package dllpckg;

public class DLLNode {
    Node head;
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int val){
            data=val;
            prev=null;
            next=null;
        }
    }
    public void insertDLList(int val){

    }
    public void printDLList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}

