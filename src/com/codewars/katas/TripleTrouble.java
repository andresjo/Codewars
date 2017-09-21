/*Write a function

TripleDouble(long num1, long num2)
which takes in numbers num1 and num2 and returns 1 if there is a straight 
triple of a number at any place in num1 and also a straight double of the same number in num2.
For example:
TripleDouble(451999277, 41177722899) == 1 // num1 has straight triple 999s and 
                                          // num2 has straight double 99s

TripleDouble(1222345, 12345) == 0 // num1 has straight triple 2s but num2 has only a single 2
*/
package com.codewars.katas;

public class TripleTrouble {
	
	public static int tripleDouble(long num1, long num2){
		String nums1 = Long.toString(num1);
		String nums2 = Long.toString(num2);
    
	    for ( int i = 0; i < 10; i++){
	      if ((nums1.indexOf(""+i+i+i) > -1) && (nums2.indexOf(""+i+i) > -1)){
	        return 1;
	      }
	    }
	    return 0;
	}

}
