package assignment;
import java.util.*;

public class q1_getbinary {
    public static void getbinary(int n){
        Queue<String>q=new LinkedList<String>();
        q.add("1");
        while(n-- >0){
            String s1=q.peek();
            q.remove();
            System.out.print(s1+" ");
            String s2=s1;
            q.add(s1+"0");
            q.add(s2+"1");

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        getbinary(n);
    }
}

