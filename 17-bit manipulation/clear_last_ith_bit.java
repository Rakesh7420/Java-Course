public class clear_last_ith_bit {
    public static int clear_last(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clear_last(15, 2));
    }
}
