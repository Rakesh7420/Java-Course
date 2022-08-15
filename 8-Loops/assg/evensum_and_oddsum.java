public class evensum_and_oddsum {
    public static void main(String args[]) {
        int n = 10;
        int evensum;
        int oddsum;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;

            } else {
                if (i % 2 != 0) {
                    sum1 = sum1 + i;
                }

            }
        }
        System.out.println("evensum is " + sum);
        System.out.println("oddsum is " + sum1);
    }
}
