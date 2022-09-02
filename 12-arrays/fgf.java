import java.lang.annotation.Target;

public class fgf {
    public static int search(int[] nums,int left,int right,int target){ 
        int l = left; 
        int r  = right;
        // System.out.println(left+" "+right); 
        while(l <= r){ int mid = l + (r - l)/2; 
            if(nums[mid] ==   target){
                 return mid;
            } else if(nums[mid] > target){
                 r = mid-1; 
                } else{ 
                    l = mid+1;
                 } 
                }//smallest element index
                return -1;
                // public int minSearch(int[] nums){
                //      int left = 0; 
                //      int right = nums.length-1;
                //     //   Question 2 (DSA Sheet #6)Approach - Based on Binary Searchgayatrigudur.2002@gmail.com

}
 public static void main(String[] args) {
    int nums[]={4,5,6,7,0,1,2};
    for(int i=0;i<nums.length;i++){
    System.out.println(search(nums,target));
    }
 }}
