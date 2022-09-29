public class split_array_into_k_subarrays {

    public static int ans=10000000;
    public static void solve(int arr[],int n,int k,int index,int sum,int maxsum){

          if(k==1){
              maxsum=Math.max(sum,maxsum);
              sum=0;
              for(int i=index;i<n;i++){
                  sum+=arr[i];
              }
              maxsum=Math.max(sum,maxsum);
               ans=Math.min(ans,maxsum);
              return;
          }
        sum=0;
        for(int i=index;i<n;i++){
            sum+=arr[i];
            maxsum=Math.max(sum,maxsum);
            solve(arr,n,k-1,i+1,sum,maxsum);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,1,2};
        int n= arr.length;
        int k=2;
      solve(arr,n,k,0,0,0);
        System.out.println(ans);
    }
}
