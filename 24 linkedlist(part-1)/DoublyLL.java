public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data =data;
            this.next=next;
            this.prev=prev;

        }
        }

        //
        public static Node head;
        public static  Node tail;
        public static int size;

        //addFirst
        public void addFirst(int data){
            Node newnode=new Node(data);
            size++;
            if(head==null){
                head=tail=newnode;
                return;
            }
            newnode.next=head;
            head.prev=newnode;
           head=newnode;
        }

        //addLast
    public void addLast(int data){
            Node newnode=new Node(data);
            size++;
            if(head==null){
                head=tail=newnode;
            }
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
    }
    //print
    public void print(){
           Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" <-> ");
                temp=temp.next;
        }
        System.out.println("null");
    }

    //removefirst
    public int removefirst(){
        if (size == 0) {
            System.out.println("dl is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    //removelast
    public static   int removelast(){
        if (size == 0) {
            System.out.println("dl is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        tail=prev.next;
        prev.next=null;
        size--;
        return val;
    }

    public void reverse(){
            Node curr=head;
            Node prev=null;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                curr.prev=
                prev=curr;
                curr=next;
            }
            head=prev;
    }

    public static void main(String[] args) {
        DoublyLL dl=new DoublyLL();
        dl.addFirst(5);
        dl.addFirst(4);
        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);
        dl.print();
        dl.reverse();
        dl.print();
//        dl.addLast(6);
//        dl.print();
//        System.out.println(dl.size);
//        dl.removefirst();
//        dl.removelast();
//        dl.print();

    }
}
