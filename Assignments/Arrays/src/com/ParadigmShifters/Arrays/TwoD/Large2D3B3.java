/* Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222*/
package com.ParadigmShifters.Arrays.TwoD;

public class Large2D3B3 {

	public static void main(String[] args) {
		if (args.length != 9)
			System.out.println("Please enter 9 integer numbers");

		int[][] array = new int[3][3];
		int x = 0;

		// storing input to 2d array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = Integer.parseInt(args[x++]);
			}
		}
		
		int max = 0;
		
		// getting max of array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				max = array[i][j] > max ? array[i][j] : max;
			}
		}
			
		System.out.println("The biggest number in the given array is " + max);
		

	}

}
