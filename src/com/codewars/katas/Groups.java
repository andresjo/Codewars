/*In English and programming, groups can be made using symbols such as "()" and "{}" that change meaning. 
However, these groups must be closed in the correct order to maintain correct syntax.

Your job in this kata will be to make a program that checks a string for correct grouping.*/

package com.codewars.katas;

import java.util.ArrayList;

public class Groups {
	
	public static boolean groupCheck(String group){
		ArrayList<Character> opened = new ArrayList<>();
		
		for (int i = 0; i < group.length(); i++) {
			char currentChar = group.charAt(i);
			
			if (currentChar == '(' || currentChar == '[' || currentChar == '{'){
				opened.add(currentChar);
			}else{
				if(opened.size() == 0){
					return false;
				}
				if(currentChar == ')' && opened.get(opened.size()-1) == '('){
					opened.remove(opened.size()-1);
				}if(currentChar == ']' && opened.get(opened.size()-1) == '['){
					opened.remove(opened.size()-1);
				}if(currentChar == '}' && opened.get(opened.size()-1) == '{'){
					opened.remove(opened.size()-1);
				}
			}
			
		}
		
	    return opened.size() == 0;
	}

}
