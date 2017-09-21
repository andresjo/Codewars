/*In this kata, you must implement the Bind function for lists, or arrays. 
In haskell, the function is represented by >>=, but we'll just call it bind.

Essentially, bind should map the array with the function given, and then flatten it one time. 
Don't manipulate the original array; make you function pure: without side-effects, 
so that no variables are edited whilst the function is carried out.*/

package com.codewars.katas;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Binder<T, I> {
	
  public List<I> bind(List<T> list, Function<T, List<I>> func) {
	  return list.stream()
			  .map(func)
			  .flatMap(i -> i.stream())
			  .collect(Collectors.toList());
  }
  
}