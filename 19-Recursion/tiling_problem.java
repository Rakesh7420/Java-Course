public class tiling_problem {
    public static void main(String[] args) {
        System.out.println(tiling(3));
    }

    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        return tiling(n-1)+tiling(n-2);
    }
}
