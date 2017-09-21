/*Your task is to sort a given string. Each word in the String will contain a single number. 
This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input String is empty, return an empty String. 
		The words in the input String will only contain valid consecutive numbers.

For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"*/

package com.codewars.katas;

import java.util.Arrays;

public class Order {
	
	public static String order(String words) {
		StringBuilder builder = new StringBuilder();
		
	    Arrays.stream(words.split(" "))
	    		.sorted((w1, w2) -> Integer.compare(wordValue(w1), wordValue(w2)))
	    		.forEach(e -> builder.append(" " + e));
	    
	    return builder.toString().trim();
	}
	
	private static int wordValue(String word){
		for (int i = 0; i < word.length(); i++){
			if (Character.isDigit(word.charAt(i))){
				return Character.getNumericValue(word.charAt(i));
			}
		}
		
		return 0;
	}

}
