import java.util.ArrayList;

public class pairsum_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        System.out.println(pair_sum(list, target));
        System.out.println(pair_sum_2p(list, target));
    }
//brute force
    public static boolean pair_sum(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
                for(int j=i+1;j<list.size();j++){
                    if(list.get(i)+list.get(j)==target)
                        return true;

                    }
                }
        return false;
    }

    //2 pointer approach
    public static boolean pair_sum_2p(ArrayList<Integer>list,int target){
        int lp=0;
        int rp=list.size()-1;

while(lp<rp) {
    if (list.get(lp)+list.get(rp) == target) {
        return true;
    } else if (list.get(lp)+list.get(rp) < target) {
        lp++;
    } else {
        rp--;
    }
}
        return false;
    }
}
