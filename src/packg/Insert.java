package packg;
public class Insert extends  LinkedList{

    @Override
    public  void insertLinkedList(int val){
        Node temp=head;
        Node new_node=new Node(val);
        if(head==null){
            head=new_node;
            return;
        }
        while(temp.next!=null)
            temp= temp.next;
        temp.next=new_node;
        new_node.next=null;
        return;
    }
    public static void main(String args[]){
        Insert list=new Insert();
        list.insertLinkedList(2);
        list.insertLinkedList(4);
        list.insertLinkedList(6);
        list.insertLinkedList(8);
        list.insertLinkedList(10);
        list.printList(list.head);
    }
}
