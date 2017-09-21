/*We have the following sequence:

f(0) = 0
f(1) = 1
f(2) = 1
f(3) = 2
f(4) = 4;
f(n) = f(n-1) + f(n-2) + f(n-3) + f(n-4) + f(n-5);
Your task is to give the number of total values for the odd terms of the sequence up to the n-th term (included). 
(The number n (of n-th term) will be given as a positive integer)

The values 1 (one) is the only that is duplicated in the sequence and should be counted only once.*/

package com.codewars.katas;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pentanacci {
	private static Map<Integer, BigInteger> fibs = new HashMap<>();
	
	public static long countOddPentaFib(long n) {
		List<BigInteger> oddPentaFibs = new ArrayList<>();
		
		for(int i = 0; i <= n; i++){
			BigInteger num = pentaFib(i);
			if ( num.remainder(new BigInteger("2")).intValue() != 0  && !oddPentaFibs.contains(num) ) {
				oddPentaFibs.add(num);
			}
		}
		
		return oddPentaFibs.size();
    }
	
	private static BigInteger pentaFib(int n) {
		fibs.put(0, new BigInteger("0"));
		fibs.put(1, new BigInteger("1"));
		fibs.put(2, new BigInteger("1"));
		fibs.put(3, new BigInteger("2"));
		fibs.put(4, new BigInteger("4"));
		
		if (fibs.containsKey(n)){
			return fibs.get(n);
		}
		BigInteger numb = pentaFib(n-1)
							.add(pentaFib(n-2))
							.add(pentaFib(n-3))
							.add(pentaFib(n-4))
							.add(pentaFib(n-5));
		fibs.put(n, numb);
		
		return numb;
	}
	
	public static long countOddPentaFibAlternative(long n){
		return (n-2) % 6 == 5 ? 2 + 2*((n-2)/6) : 1 + 2*((n-2)/6);
	}
	
}
