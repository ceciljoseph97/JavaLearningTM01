/* Write a program to initialize an integer array and print the sum and average of the array.
 * OCJ*/
package com.ParadigmShifters.Arrays.OneD;

import java.util.Arrays;

public class SumAvg {
	public static int sum(int [] array) {
		return Arrays.stream(array).sum();
	}

	public static void main(String[] args) {
int[] array = {5, 4, 3, 9, 1, 7, 9};
		
		double sum = 0;
		double avg;
		
		sum=sum(array);
		
		avg = sum / array.length;
		
		System.out.printf("Sum:%.2f\nAverage: %.2f",sum,avg);
	}

}
