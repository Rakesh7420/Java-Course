import java.util.*;
public class tax{
    public static void main(String arg[]) {
        Scanner sc= new Scanner(System.in);
        int income=sc.nextInt();
        int tax;
        if(income<=50000){
            tax=0;
        }else if(income>500000 && income<100000 ){
            tax=(int)(income*0.2);
        }else{
            tax=(int)(income*0.3);
        }
        System.out.println("Your tax is:- "+tax);
    }
}