import java.util.*;
public class average{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the first number:");
        int x=sc.nextInt();
        System.out.print("Input the second number:");
        int y=sc.nextInt();
        System.out.print("Input the third number:");
        int z=sc.nextInt();
        System.out.print("the average is:"+average(x,y,z));
    }
    public static double average(double x ,double y,double z){
        return (x+y+z)/3;
    }
}