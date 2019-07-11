 package com.ParadigmShifters.Arrays.OneD;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinMax {

	public static void main(String[] args) {
		int[] array = {5, 4, 3, 9, 1, 7, 9};
		
		int min = array[0];
		int max = array[0];
		Arrays.sort(array);
		
		
		/*
		 * for (int i = 0; i < array.length; i++) { if (array[i] < min) min = array[i];
		 * if (array[i] > max) max = array[i]; }
		 */
		
		System.out.println("Min: " + array[0]);
		System.out.println("Max: " + array[array.length-1]);

	}

}
