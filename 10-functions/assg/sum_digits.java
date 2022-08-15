import java.util.*;
public class sum_digits {
    public static void main(String[] args) {
    Scanner sc=  new Scanner(System.in);
    System.out.print("enter the number: ");
    int digit=sc.nextInt();
    System.out.print("sum of digits of this number is = "+ sum(digit));
}
public static int sum(int n){
int sum=0;
while(n>0){
    int last_digit=n%10;
    sum+=last_digit;
    n/=10;

}
return sum;
}
}
