public class palindrome_with_numbers {
    
        public static void pyramid(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (int j =i; j >=1; j--) {
                    System.out.print(j );
                }

                for (int j =2; j<=i; j++) {
                    System.out.print(j );
                }
                
                System.out.println();
            }
        }
    
        public static void main(String args[]) {
            pyramid(5);
        }
    }
    

