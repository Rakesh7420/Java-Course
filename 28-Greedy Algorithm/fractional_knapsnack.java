
import java.util.*;
public class fractional_knapsnack {
    public static void main(String[] args) {
        int val[]={60,100,120 };
        int weight[]={10,20,30};
int W=50;
        double ratio[][]=new double[val.length][2];
        //oth col=idx, 1st col=ratio
        for(int i=0;i< val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity=W;
        int finalVAl=0;

        for(int i= ratio.length-1;i>=0;i--){
int idx=(int)ratio[1][0];
if(capacity>=weight[idx]){//full val adding
    finalVAl+=val[idx];
    capacity-=weight[idx];
}else{//portion of val is adding
    finalVAl+=(ratio[i][1]*capacity);
    capacity=0;
    break;
}
        }
        System.out.println("The finalvalue = "+finalVAl);
    }
}
