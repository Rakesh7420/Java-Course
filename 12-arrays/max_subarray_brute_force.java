public class max_subarray_brute_force{

    public static void brute(int numbers[]){
int curr_sum=0;
int max_sum=Integer.MIN_VALUE;
for(int i=0;i<=numbers.length;i++){
    for(int j=i;j<=numbers.length;j++){
        curr_sum=0;
        for(int k=i;k<j;k++){
            curr_sum+=numbers[k];

            // }System.out.print(curr_sum);
          }  if(max_sum<curr_sum){

            max_sum=curr_sum;
        }
        
    }
}
System.out.println("The max sum is : "+max_sum);
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
       brute(numbers);
    }
}