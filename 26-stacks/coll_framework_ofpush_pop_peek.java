
import java.util.*;

public class coll_framework_ofpush_pop_peek {
    public static void main(String[] args) {
       Stack<Integer>list=new Stack<>();
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
