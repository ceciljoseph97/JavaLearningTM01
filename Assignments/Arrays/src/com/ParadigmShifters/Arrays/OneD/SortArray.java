/*Write a program to initialize an array and print them in a sorted order.
*/

package com.ParadigmShifters.Arrays.OneD;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] array = {5, 4, 3, 9, 1, 7, 9};
		Arrays.sort(array);
		for(int x: array) System.out.printf("%d\t",x);

	}

}
