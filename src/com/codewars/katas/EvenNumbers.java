/*Write a function divisibleBy, which takes two arguments and returns all number, 
which are divisible by given divisor. First argument is array of numbers and the second is divisor.

E.g. divisibleBy([1,2,3,4,5,6], 2) sould returns [2,4,6]*/

package com.codewars.katas;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
	
	  public static int[] divisibleBy(int[] numbers, int divider) {
		  List<Integer> divisibleNumbs = new ArrayList<Integer>();
		  
		  for (int long1 : numbers) {
			if (long1 % divider == 0){
				divisibleNumbs.add(long1);
			}
		  }
		  
		  int[] ret = new int[divisibleNumbs.size()];
		  
		  for (int i = 0; i<divisibleNumbs.size();i++){
			  ret[i] = divisibleNumbs.get(i);
		  }
		  
		  return ret;
	  }
	  
}
