/*A man has a rather old car being worth $2000. He saw a secondhand car being worth $8000. 
He wants to keep his old car until he can buy the secondhand one.

He thinks he can save $1000 each month but the prices of his old car and of the new one 
decrease of 1.5 percent per month. Furthermore the percent of loss 
increases by a fixed 0.5 percent at the end of every two months.


How many months will it take him to save up enough money to buy the car he wants, and how much money will he have left over?
		
		nbMonths(2000, 8000, 1000, 1.5) should return [6, 766]
		where 6 is the number of months at the end of which he can buy the new car and 766 is the nearest integer to '766.158...' .*/

package com.codewars.katas;

public class BuyCar {
	public static final double LOSS_PERCENT_INCREASE = 0.5;

	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingPerMonth, double percentLossByMonth) {
	    int months = 0;
	    double moneyLeft = 0;
	    double priceOld = startPriceOld;
	    double priceNew = startPriceNew;
	    double savings = 0;
	    
	    while ((priceOld + savings) < priceNew){
	    	months++;
	    	
	    	if (months % 2 == 0) {
	    		percentLossByMonth = percentLossByMonth + LOSS_PERCENT_INCREASE;
	    	}
	    	
	    	priceOld = priceOld - priceOld * (percentLossByMonth / 100);
	    	priceNew = priceNew - priceNew * (percentLossByMonth / 100);
	    	savings = savings + savingPerMonth;
	    }
	    
	    moneyLeft = (savings + priceOld) - priceNew;
	    
		return new int[]{months, (int) Math.round(moneyLeft)};
	}

}
