/*In this little assignment you are given a string of space
separated numbers, and have to return the highest and lowest number.

Output string must be two numbers separated by a single space, and highest number is first.*/

package com.codewars.katas;

public class HighestAndLowest {
	
	  public static String highAndLow(String numbers) {
	    String[] numbsSplit = numbers.split(" ");
	    
	    int lowest = Integer.parseInt(numbsSplit[0]);
	    int highest = Integer.parseInt(numbsSplit[0]);
	    
	    for (String currentNumber : numbsSplit) {
			if(Integer.parseInt(currentNumber) < lowest){
				lowest = Integer.parseInt(currentNumber);
			}
			
			if(Integer.parseInt(currentNumber) > highest){
				highest = Integer.parseInt(currentNumber);
			}
		}
	    
	    return highest + " " + lowest;
	  }

}
