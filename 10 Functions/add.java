import java.util.*;

public class add {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Calculatesum(a, b);
        System.out.println(sum);

    }

    public static int Calculatesum(int a, int b) {
        return a + b;
    }

}