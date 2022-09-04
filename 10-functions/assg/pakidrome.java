import java.util.*;

public class pakidrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an number:");
        int palindrome = sc.nextInt();
        if (isPalindrome(palindrome)) {
            System.out.print("number " + palindrome + " is a palindrome ");
        } else {
            System.out.print("number " + palindrome + " is not a palindrome ");
        }
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome > 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;

        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }

}
