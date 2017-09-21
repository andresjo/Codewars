/*Lucas numbers are numbers in a sequence defined like this:

L(n) = 2 if n = 0
L(n) = 1 if n = 1
otherwise
L(n) = L(n - 1) + L(n - 2)
Your mission is to define a function lucasnum(n) that returns the nth term of this sequence.

Note: It should work for negative numbers as well (how you do this is you flip the equation around, 
so for negative numbers: L(n) = L(n + 2) - L(n + 1))*/

package com.codewars.katas;

import java.util.HashMap;
import java.util.Map;

public class Lucas {
	private static Map<Integer, Integer> lucasNums = new HashMap<>();

	public static int lucasnum(int n){
		lucasNums.put(0, 2);
		lucasNums.put(1, 1);
		
		if (lucasNums.containsKey(n)) {
			return lucasNums.get(n);
		}
		
		if (n > 0){
			return lucasnum(n - 1 ) + lucasnum(n - 2);
		} else {
			return lucasnum(n + 2) - lucasnum(n + 1);
		}
	}
	
}
