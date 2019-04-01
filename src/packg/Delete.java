package packg;

public class Delete extends LinkedList {
    public static void deleteNode(Node head,int pos){
        Node temp=head,prev=null;int k=0;


        if(temp!=null&&k==pos){
            temp=head.next;
        }
            while(temp!=null&&k!=pos){
                k++;
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;
    }
    public static void main(String args[]){
        Insert list=new Insert();
        list.insertValuesToLinkedList();
        deleteNode(list.head,1);
        list.printList(list.head);
    }
}
