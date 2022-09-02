

public class buysell {
    public static int profit(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
        if(buyprice<prices[i]){
            int profit=prices[i]-buyprice;
            maxprofit=Math.max(profit, maxprofit);
     }
        else{
            buyprice=prices[i];
        }
    }
    return maxprofit;
}
public static void main(String[] args) {
    int prices[]={7,6,4,3,1};
   
    System.out.println( profit(prices));
    
}
}
