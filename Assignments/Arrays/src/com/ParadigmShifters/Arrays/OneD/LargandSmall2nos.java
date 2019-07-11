package com.ParadigmShifters.Arrays.OneD;

import java.util.Arrays;

public class LargandSmall2nos {

	public static void main(String[] args) {
		int[] array = {5, 4, 3, 6, 1, 7, 9};
		
		int min = array[0];
		int max = array[0];
		Arrays.sort(array);
		System.out.println("Smallest two in the array: " + array[0] + " and " + array[1]);
		System.out.println("Largest two in the array: " + array[array.length-1] + " and " + array[array.length-2]);
	}

}
