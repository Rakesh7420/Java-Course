import java.util.*;

public class next_greater_element {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer>s=new Stack<>();
        int nextgreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--) {
            //while loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            //add nextgreater
            if(s.isEmpty()){
               nextgreater[i]=-1;
            }
            else {
                nextgreater[i]=arr[s.peek()];
            }
            //push element
            s.push(i);
        }
        for(int i=0;i<nextgreater.length;i++){
            System.out.print(nextgreater[i]+" ");
        }
        System.out.println();
    }
}
