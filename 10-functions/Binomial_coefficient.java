public class Binomial_coefficient{
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;

    }
    public static int Bincoe(int n,int r){
        int fact_n= factorial(n);
        int fact_r= factorial(r);
        int fact_nmr=factorial(n-r);
        int Bincoe=fact_n/(fact_r*fact_nmr);
        return Bincoe;

    }

    public static void main(String args[]){
        System.out.println(Bincoe(5,2));
    }
}