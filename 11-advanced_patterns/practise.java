public class practise {
    public static void tri_angle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }

    public static void main(String args[]) {
        tri_angle(3);
        
    }
}
