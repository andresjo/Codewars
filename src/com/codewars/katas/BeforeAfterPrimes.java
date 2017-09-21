/*We need a function primeBefAft() that gives the largest prime below a certain given value n,
and the smallest prime larger than this value.*/

package com.codewars.katas;

public class BeforeAfterPrimes {

	public static long[] primeBefAft(long n) {
		long[] primeBeforeAndAfter = {n-1, n+1};
		
		while (!isPrime(primeBeforeAndAfter[0]) ) {
			primeBeforeAndAfter[0] -= 1;
		}
		
		while (!isPrime(primeBeforeAndAfter[1]) ) {
			primeBeforeAndAfter[1] += 1;
		}
		
		return primeBeforeAndAfter;
	}
	
	private static boolean isPrime(long n) {
		if (n % 2 == 0){
			return false;
		}
		
		for (int i = 3; i <= Math.sqrt(n); i += 2){
			if (n % i == 0){
				return false;
			}
		}
		
		return true;
	}

}
