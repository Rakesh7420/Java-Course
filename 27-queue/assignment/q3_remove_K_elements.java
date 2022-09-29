package assignment;
import java.util.*;
public class q3_remove_K_elements {
public static  void remove(Queue<Integer>q,int k){
    Stack<Integer>s=new Stack<>();
    int size=k;
    int size1=q.size();
    for(int i=0;i<size;i++){
        s.push(q.remove());
    }

        while(!s.isEmpty()) {
            q.add(s.pop());
        }
        for(int i=0;i<size1-k;i++){
            q.add(q.remove());
        }
}

    public static void main(String[] args) {
Queue<Integer>q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

int k=5;

remove(q,k);
while(!q.isEmpty()){
    System.out.print(q.remove()+" ");
}
        System.out.println();
    }
}
