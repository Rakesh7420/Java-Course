public class reverse {
    public static void main(String[] args) {
        int i = 54321;
        while (i > 0) {
            int rev = i % 10;
            System.out.print(rev + " ");
            i = i / 10;
        }
    }
}