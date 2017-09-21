 /* 
  * count how many iterations are needed to calculate PI with a given precision using the Leibniz formula for pi
  */

package com.codewars.katas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class PiApprox {
	
	public static String iterPi2String(Double epsilon) {
		double piApprox = 1;
		double divisor = 3;
		int sign = -1;
		int iterations = 1;
		 
		while (Math.abs((4 * piApprox) - Math.PI) > epsilon) {
			piApprox = piApprox + sign * (1/divisor); 
			
			divisor = divisor + 2;
			sign = sign * -1;
			iterations++;
		}
		
		DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols(new Locale("en", "UK"));
		NumberFormat formater = new DecimalFormat("#.0000000000", formatSymbols);
		
		return "[" + iterations + ", " + formater.format(piApprox*4) + "]";
	}
	
}