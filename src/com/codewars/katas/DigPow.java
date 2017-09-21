/*
 * Given a positive integer n written as abcd... (a, b, c, d... being digits) 
 * Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
 * If it is the case we will return k, if not return -1.*/

package com.codewars.katas;

public class DigPow {
	
	public static long digPow(int n, int p) {
		String nString = Integer.toString(n);
		int res = 0;
		
		for (int i = 0; i < nString.length(); i++) {
			int digit = Character.getNumericValue(nString.charAt(i));
			res = (int) (res + Math.pow(digit, p));
			p++;
		}
		
		return res % n == 0 ? res / n : -1;
	}
	
}