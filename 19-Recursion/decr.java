public class decr{
    public static void main(String[] args) {
        int n=5;
        printdec(n);
    }

    public static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
    System.out.print(n+" ");
    printdec(n-1);
    }
}