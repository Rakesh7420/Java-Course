import java.util.Scanner;

public class input_output {
    public static void main(String args[]) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();

        System.out.println("phy" + marks[0]);
        System.out.println("chem" + marks[1]);

    }
}
