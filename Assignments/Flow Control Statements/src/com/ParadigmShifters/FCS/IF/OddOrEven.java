
/*Write a program to check if a given integer number is odd or even.
*/
package com.ParadigmShifters.FCS.IF;

public class OddOrEven {

	public static String oddEven(int num) {
		if(num%2==0) {
			return "Even";	
		}
		else return "Odd";
		
	}
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		System.out.printf("The Number %d is %s",a,oddEven(a));
		

	}

}
