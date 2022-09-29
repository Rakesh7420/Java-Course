import org.w3c.dom.Node;

import java.util.LinkedList;

public class part2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean iscycle() {    //floyds cycle finding method
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;//+1
            fast = fast.next.next;//+2
            if (slow == fast) {
                return true;//cycle exist
            }
        }
        return false;
    }

    public static void remove_cycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = true;
        while (head != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
            if (cycle = false) {
                return;
            }
        }

        //find cycle point 
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //make lastpoint to null
        prev.next = null;

    }


    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


//for removecycle or iscycle
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
System.out.println(

    iscycle());;

    remove_cycle();
    System.out.println(

    iscycle());
}
}
