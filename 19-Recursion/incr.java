public class incr {
    public static void main(String[] args) {
        int n=5;
       printInt(n);
    }
    public static void printInt(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInt(n-1);
        System.out.print(n+" ");
    }
     
}
