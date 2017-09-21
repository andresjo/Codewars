package com.codewars.utils;

import java.util.List;

public class ArrayPrinter {
	
	public static void print(Object[] array){
		for (Object object : array) {
			System.out.println(object);
		}
	}

	public static void print(long[] array) {
		for (long object : array) {
			System.out.println(object);
		}
	}

	public static void print(int[] array) {
		for (int object : array) {
			System.out.println(object);
		}
		
	}

	public static <T> void print(List<T> list) {
		for (T object : list) {
			System.out.println(object);
		}
		
	}

}
