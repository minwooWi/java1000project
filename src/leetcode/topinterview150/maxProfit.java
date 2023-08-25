package leetcode.topinterview150;
public class maxProfit {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit=0;

        for(int price : prices){
            if(price < min) min = price;
            int profit = price - min;
            if(profit > maxProfit) maxProfit = profit;
        }

        return maxProfit;
    }
    public static void main(String[] args){
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
}
