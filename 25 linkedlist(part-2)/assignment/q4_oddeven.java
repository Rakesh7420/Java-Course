public class q4_oddeven {
     static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    public  static  Node head;
     public static Node tail;
     public static int size;
public static Node odd,even;
     public void segregate_odd_even(){
         Node temp=head;
//         Node odd,even;
         while(temp!=null){
             if(temp.data%2!=0){
                 odd=temp;
                 System.out.println(odd);
                 temp=temp.next;
             }else{
               even=temp;
                 System.out.println(even);
               temp=temp.next;
             }
         }

     }

     public void push(int data){
         Node new_node=new Node(data);
         new_node.next=head;
         head=new_node;
     }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
q4_oddeven list=new q4_oddeven();
list.push(6);
        list.push(1);
        list.push(4);
        list.push(5);
        list.push(10);
        list.push(12);
        list.push(8);
        list.print();
        list.segregate_odd_even();
        list.print();
    }
}
