import java.util.*;
public class indian_coins {

    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,1000,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        //or i.e.
        //instead of above 2 lines we can solve by taking int coins and
        // in sorting we can sort like Arrays.sort(coins)
        // and then we can apply for loop in reverse order

        int countOfCoins=0;
        int amount=590;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++) {
            if (coins[i] <= amount) {
                while (coins[i] <=amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }
            System.out.println("the number of coins that are used is "+countOfCoins);

        for(int i=0;i< ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
