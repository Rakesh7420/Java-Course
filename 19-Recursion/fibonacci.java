public class fibonacci {
    public static void main(String[] args) {
        int n=7;
        System.out.println(calfibonacci(n));
    }

    public static int calfibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=calfibonacci(n-1);
        int fnm2=calfibonacci(n-2);
        return fnm1+fnm2;
    }
}
