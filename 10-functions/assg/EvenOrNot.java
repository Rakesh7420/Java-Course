import java.util.*;

public class EvenOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.print("Number is Even");

        } else {
            System.out.print("Number is odd");
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
