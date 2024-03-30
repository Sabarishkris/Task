public class Stock {
        public static int maxProfit(int[] prices) {
            int sell = 0;
            int buy = prices[0];
            int index=0;
            for(int i=0;i<prices.length;i++){
                if(buy>prices[i]){
                    buy=prices[i];
                    index=i;
                }
            }
            for(int i = index;i<prices.length; i++){
                if(  sell<prices[i]){
                    sell = prices[i];
                }
            }
            return sell==0 ? 0 :sell-buy;
        }

    public static void main(String[] args) {
        int nums[]={7,6,3,4,1};
        int profit=maxProfit(nums);
        System.out.println(profit);
    }
}
