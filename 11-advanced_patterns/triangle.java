public class triangle {
    public static void tri_angle(int n) {
        // int row = 1;
        // int col = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");

                } else {
                    System.out.print("0" + " ");

                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        tri_angle(5);
    }
}
