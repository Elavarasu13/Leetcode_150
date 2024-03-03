package Leetcode_150;

public class Buy_sell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices [] = {7,1,5,3,6,4};
		Buy_sell profit = new Buy_sell();
		System.out.println(profit.Max_profit(prices));
		

	}
	public static int Max_profit(int []prices)
	{
		int buy = prices[0];
		int maxProfit = 0;
		for(int i = 1;i < prices.length;i++)
		{
			if(buy > prices[i])
				buy = prices[i];
			else if(prices[i] - buy > maxProfit)
			maxProfit = prices[i] - buy;
		}
		return maxProfit;
			
	}

}
