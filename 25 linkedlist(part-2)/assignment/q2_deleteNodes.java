import org.w3c.dom.Node;

public class q2_deleteNodes {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    public void addlast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }

    public static  void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public Node delete(Node head,int M,int N){
        Node dummy=new Node(M) ;
        dummy.next=head;
        Node temp=dummy;
        while(temp!=null &&  temp.next!=null){
            for(int i=0;i<M && temp!=null&& temp.next!=null;i++)
            temp=temp.next;
            for(int j=0;j<N && temp!=null && temp.next!=null;j++)
                temp.next=temp.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        q2_deleteNodes ll=new q2_deleteNodes();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.addlast(7);
        ll.addlast(8);
        ll.print();
        ll.delete(head,2,2);
        ll.print();
    }
}
