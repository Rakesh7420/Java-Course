
import java.util.LinkedList;

public class LL_in_java_framework {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addFirst(0);
        System.out.println(ll);
        System.out.println(ll.size());
       ll.removeLast();
       ll.removeFirst();
        System.out.println(ll);
        System.out.println(ll.size());
        ll.remove(2);
        System.out.println(ll);

    }
}
