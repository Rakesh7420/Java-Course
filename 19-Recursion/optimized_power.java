public class optimized_power {
    public static void main(String[] args) {
        System.out.println(optimized(5, 3));
    }

    public static int optimized(int a,int n){
        if(n==0){
            return -1;
        }
        //for even
        int halfpower=optimized(a,n/2);
        int halfpowersqr=halfpower*halfpower;

        //for odd
        if(n%2!=0){
            halfpowersqr=a*halfpowersqr;
        }
        return halfpowersqr;
    }
}
