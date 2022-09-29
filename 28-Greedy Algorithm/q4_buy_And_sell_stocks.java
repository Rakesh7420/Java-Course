public class q4_buy_And_sell_stocks {
public static int profit(int prices[],int n){
    int buy=prices[0];
    int maxprofit=0;
    for(int i=1;i<n;i++){
        if(buy>prices[i]){
            buy=prices[i];
        }
        else if (prices[i]-buy>maxprofit) {
            maxprofit=prices[i]-buy;
        }
    }
    return maxprofit;
}

    public static void main(String[] args) {
        int prices[] = {7, 6, 4, 3, 1};
        int n=prices.length;
        System.out.println(profit(prices,n));

        int prices1[] = {7, 1, 5, 6, 4 };
        int n1=prices.length;
        System.out.println(profit(prices1,n1));

        int prices2[]={7, 1, 5, 3, 6, 4};
        int n2=prices.length;
        System.out.println(profit(prices2,n2));
    }
}
