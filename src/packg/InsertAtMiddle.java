package packg;

public class InsertAtMiddle extends LinkedList {
    public static int countLinkList(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void insertAtMiddle(Node head,int len,int val){
        int low=0;int high=len-1;
        int mid=(low+high)/2;
        System.out.println(mid);
        Node temp=head;
        int pos=0;
        while(temp!=null&&pos<mid-1){
            pos++;
            temp=temp.next;
        }
        Node new_node=new Node(val);
        new_node.next=temp.next;
        temp.next=new_node;
    }
    public static void main(String args[]){
        Insert list=new Insert();
        list.insertValuesToLinkedList();
        int len=countLinkList(list.head);
        System.out.println(len);
        insertAtMiddle(list.head,len,7);
        list.printList(list.head);
    }
}
