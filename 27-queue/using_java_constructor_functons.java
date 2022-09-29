import java.util.*;
public class using_java_constructor_functons {

    public static void main(String[] args) {
//        Queue q=new Queue();
        Queue<Integer>q=new LinkedList<>();
        //we cannot take new Queue<>() bcz queue is an interface therefore
        // we can use either LinkedList orArrayDeque in queue
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
