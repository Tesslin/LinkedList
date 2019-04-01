package dllpckg;

public class InsertDll extends DLLNode {
    @Override
    public void insertDLList(int val){
        Node temp=head;
        Node new_node=new Node(val);
        if(head==null){
            new_node.prev=null;
            head=new_node;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.prev=temp;
    }
    public static void main(String args[]){
        InsertDll list=new InsertDll();
        list.insertDLList(10);
        list.insertDLList(20);
        list.insertDLList(30);
        list.insertDLList(40);
        list.insertDLList(50);
        list.printDLList(list.head);
    }
}
