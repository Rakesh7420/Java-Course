package assignment;

import java.util.ArrayList;

public class q1_inc_or_sec {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(inc(list));
    }

    public static boolean inc(ArrayList<Integer>list){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                inc=false;
            } else if (list.get(i) < list.get(i + 1)) {

                dec=false;
            }
            }
        return inc || dec;
        }
    }

