public class factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(n);
    }

    public static int fact(int n){
        if(n==1){
            return n;
        }
        int factnew=n*fact(n-1);
        return factnew;
    }
}
