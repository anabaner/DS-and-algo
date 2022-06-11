package MSInterview;

import java.util.ArrayList;

public class MaxProfitOnDay {

	public static void main(String[] args) {
		  int price[] = { 100, 180, 260, 310, 40, 535, 695 };
	        int n = price.length;
	 
	        stockBuySell(price, n);
	}

	private static int stockBuySell(int[] price, int n) {
		
        int profit = 0;
 
        int j = 0;
 
        for (int i = 1; i < price.length; i++)
        {
            if (price[i - 1] > price[i]) {
                j = i;
            }
 
            if (price[i - 1] <= price[i] &&
                (i + 1 == price.length || price[i] > price[i + 1]))
            {
                profit += (price[i] - price[j]);
                System.out.printf("Buy on day %d and sell on day %d\n", j + 1, i + 1);
            }
        }
 
        return profit;
		
	}

}