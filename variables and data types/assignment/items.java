

import java.util.*;
public class items {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pencil=sc.nextInt();
        int pen=sc.nextInt();
        int eraser=sc.nextInt();
        int total=pencil+pen+eraser;
        float percent= total+(0.18f*total);
    
        System.out.println("The total bill is " + total);
        System.out.println("The total bill with 18% tax is " + percent);


    }
}
