

public class by_prefix_sum {
    public static void prefix(int numbers[]){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=1;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;

                curr_sum=start==0? prefix[end]: prefix[end]-prefix[start-1];

                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }
            }
        }
        System.out.println("The max sum is : "+max_sum );
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        prefix(numbers);
    }
}
