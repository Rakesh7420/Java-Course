
//import java.util.

import org.w3c.dom.Node;

public class push_pop_linkedlist {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        static Node head=null;

        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node new_node =new Node(data);
            if(isEmpty()){
                head=new_node;
                return;
            }
            new_node.next=head;
            head=new_node;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top= head.data;;
            head.next=head;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        stack list=new stack();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

       while(!list.isEmpty()){
           System.out.println(list.peek());
//           list.pop();
       }



    }


}
