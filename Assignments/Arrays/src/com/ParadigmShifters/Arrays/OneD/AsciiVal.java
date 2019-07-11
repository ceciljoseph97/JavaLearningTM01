/*
Initialize an integer array with ascii values and print the corresponding character values in a single row.*/
package com.ParadigmShifters.Arrays.OneD;

public class AsciiVal {

	public static void main(String[] args) {
		int[] array = {48, 55, 68, 88, 101, 122};
			
		for (int i = 0; i < array.length; i++) {
				System.out.printf("%c ", array[i]);
			}
		
	}

}
