public class primes_in_ranges{
    public static boolean is_prime(int n) {
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void in_range(int n){
        for(int i=2;i<=n;i++){

            if(is_prime(i)){   //true//
                System.out.print(i+" ");
            }
            
        }
        System.out.println();
    }
    public static void main(String args[]) {
        in_range(20);
    }
}
 