
public class butterfly {
    public static void main(String args[]) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else if (j <= 8 - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 8; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else if (j <= 8 - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
