
public class trapping_rainwater {
    public static int trapped(int height[]){
//calculate left max boundary
int leftmax[]=new int [ height.length];
leftmax[0]= height[0];
for(int i=1;i<leftmax.length;i++){
leftmax[i]=Math.max(leftmax[i-1], height[i]);
}
//calculate right max boundry
int rightmax[]=new int [ height.length];
rightmax[height.length-1]= height[height.length-1];
for(int i=height.length-2;i>=0;i--){
    rightmax[i]=Math.max(height[i],rightmax[i+1]);
}

//calculate trappedwater
int water=0;
for(int i=0;i<height.length;i++){
int waterlevel=Math.min(leftmax[i], rightmax[i]);
water +=(waterlevel-height[i]);
}
return water;
}


public static void main(String args[]) {
    int height[]={4,2,0,6,3,2,5};
    System.out.println( trapped(height));
}
}
