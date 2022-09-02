public class clear_ith_bit {
    public static int clear(int n,int i){
        int bitmask=~(1<<i);
        return(n&bitmask);
    }

    public static void main(String[] args) {
        System.out.println(clear(10,1));
    }
}
