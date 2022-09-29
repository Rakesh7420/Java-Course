package assignment;
import java.util.LinkedList;
import java.util.*;

public class q1_linkedlist {

    static class Node {
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

     static boolean isPalindrome(Node head){
         Node slow=head;
         boolean ispal=true;
         Stack<Character>s=new Stack<>();

         while(slow!=null){
             s.push((char) slow.data);
             slow=slow.next;
         }
         while(head!=null){
            char i=s.pop();
             if(head.data==i){
                ispal=true;
             }else{
                 ispal=false;
                 break;
             }
         }
         return ispal;
     }

    public static void main(String[] args) {
         LinkedList<Character>list=new LinkedList<>();
         list.addFirst('A');
         list.addFirst('B');
        list.addFirst('C');
        list.addFirst('B');
        list.addFirst('A');
        System.out.println(isPalindrome(head));

    }
}
