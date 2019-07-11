/* Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}*/

package com.ParadigmShifters.Arrays.OneD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoDupli {

	public static void main(String[] args) {
		int[] array = {12, 34, 12, 45, 67, 89};
		List<Integer> distinctArray = new ArrayList<>();
		for (int item : array) {
			if (!distinctArray.contains(item))
				distinctArray.add(item);
		}
		System.out.println(Arrays.toString(distinctArray.toArray()));	

	}

}
