import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);
        deque.addLast(7);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println("the first element is : "+deque.getFirst());
        System.out.println("the last element is : "+deque.getLast());
    }
}
