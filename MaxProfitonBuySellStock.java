package MSInterview;

public class MaxProfitonBuySellStock {

	static int maxProfit(int prices[], int size)
    {
        int maxProfit = 0;
     
        for (int i = 1; i < size; i++)
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        return maxProfit;
    }
 
    public static void main(String[] args)
    {
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;
 
        System.out.println(maxProfit(price, n));
    }
}
