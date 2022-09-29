import org.w3c.dom.Node;

public class q3_swap {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;


    public void swapping(int x,int y){
        if(x==y) return ;

        Node prevX=null,currX=head;
        while(currX!=null && currX.data!=x){
            prevX=currX;
            currX=currX.next;
        }
        Node prevY=null,currY=head;
        while(currY!=null && currY.data!=y){
            prevY=currY;
            currY=currY.next;
        }

        if(currX==null && currY==null) return ;

        if(prevX!=null)
            prevX.next=currY;
        else
            head=currY;

        if(prevY!=null)
            prevY.next=currX;
        else
            head=currX;


        //swap
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
    }

    public void push(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
q3_swap LL_list=new q3_swap();
LL_list.push(4);
        LL_list.push(3);
        LL_list.push(2);
        LL_list.push(1);
       LL_list.print();
       LL_list.swapping(2,4);
       LL_list.print();

    }

    //Sample Input 1: 1->2->3->4,  x = 2, y = 4Sample Output 1: 1->4->3->2
}
