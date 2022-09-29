import java.util.ArrayList;

public class container_with_most_water {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(height(list));
        System.out.println(height1(list));
    }

    //brute force
    public static int height(ArrayList<Integer>list){
        int maxwater=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
              int ht=Math.min(list.get(i),list.get(j));
             int width=j-i;
             int curr_water=width*ht;
             maxwater=Math.max(maxwater,curr_water);

            }
        }
        return maxwater;
    }

    //s pointer approach
    public static int height1(ArrayList<Integer>list) {
        int maxwater=0;
        int lp = 0;
        int rp = list.size()-1;
        while(lp!=rp){
            int ht=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int currwater=width*ht;
            maxwater=Math.max(currwater,maxwater);
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }
}
