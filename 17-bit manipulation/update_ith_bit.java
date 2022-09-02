public class update_ith_bit {
    
    //Approach 1
    public static int clear(int n,int i){
        int bitmask=~(1<<i);
        return(n&bitmask);
    }

    public static int set(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }

    public static void update(int n,int i,int newbit){
        if(newbit==0){
            System.out.println(clear(n,i));
        }else{
            System.out.println(set(n,i));
        }
    }

    //Approach2
    public static int update_new(int n,int i,int newbit){
    n=clear(n,i);
    int bitmask=newbit<<i;
    return n|bitmask;
    }
    public static void main(String[] args) {
        update(10,2,1);
       System.out.println( update_new(10,2,1));
    }
}
