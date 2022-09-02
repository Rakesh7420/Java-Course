package assignment;

public class buyandsell {
    
    public static int profited(int prices[]){
        int buyprice=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
        if(buyprice<prices[i]){
            profit=Math.max(profit, prices[i]-buyprice);
            
     }
        else{
            buyprice=prices[i];
        }
    }
    return profit;
}
public static void main(String[] args) {
    int prices[]={7,6,4,3,1};
   
    System.out.println(profited(prices));
    
}
}
