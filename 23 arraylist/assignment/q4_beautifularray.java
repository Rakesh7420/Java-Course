package assignment;

import java.util.ArrayList;

public class q4_beautifularray {
    public static void main(String[] args) {
        int n=4;
        System.out.println(beautiful(n));
    }

    public static ArrayList<Integer> beautiful(int n){
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(1);

        for(int i=2;i<=n;i++){
            ArrayList<Integer>temp=new ArrayList<>();
            for(Integer e:ans){
                if(2*e-1<=n) temp.add(2*e-1);

            }
            for(Integer e:ans){
                if(2*e<=n) temp.add(2*e);

            }
            ans=temp;
        }
        return  ans;
    }
}
