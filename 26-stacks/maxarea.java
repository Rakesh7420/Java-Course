import java.util.*;
public class maxarea {

    public static void maximumArea(int arr[]){  //O(n)
int maxArea=0;
int nsr[]=new int [arr.length];
int nsl[]=new int[arr.length];

//next smaller right=O(n)
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){

            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else {
               nsr[i]= s.peek();
            }
            s.push(i);
        }

        //next smaller left=O(n)
        s=new Stack<>();
for(int i=0;i<arr.length;i++){

    while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
        s.pop();
    }
    if(s.isEmpty()){
        nsl[i]=-1;
    }else{
        nsl[i]=s.peek();
    }
    s.push(i);
}
        //maxArea=j-i-1=nsr=nsi-1==O(n)
        for(int i=0; i<arr.length;i++) {
            int width = nsr[i]-nsl[i]-1;
            int height=arr[i];
            int curr_area=width*height;
            maxArea=Math.max(curr_area,maxArea);
        }
        System.out.println("maximum area in Histogram = "+maxArea);
    }
    public static void main(String[] args) {
       int arr[]={2,1,5,6,2,3};
maximumArea(arr);
    }
}
