/*Given an array, find the int that appears an odd number of times.

There will always be only one integer that appears an odd number of times.*/

package com.codewars.katas;

public class FindOdd {
	
	public static int findIt(int[] array) {
		for(int i = 0; i < array.length; i++){
			int num = array[i];
			int occurences = 0;
			
			for (int j = 0; j < array.length; j++){
				if (array[j] == num){
					occurences++;
				}
			} 
			
			if (occurences % 2 != 0){
				return num;
			}
		
		}
		
		return 0;
	  }

}
