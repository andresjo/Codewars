package com.codewars.katas;

import java.util.Arrays;

public class Xbonacci {

	public double[] tribonacci(double[] s, int n) {
		double[] fibTable = Arrays.copyOf(s, n);
		
		for (int i = 3; i < n; i++){
			fibTable[i] = fibTable[i-3] + fibTable[i-2] + fibTable[i-1];
		}
		
		return Arrays.copyOf(fibTable, n);
	}
  
}
