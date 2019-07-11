/* Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001*/


package com.ParadigmShifters.FCS.Loops;

public class ReverseNum {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int reversednumber =0;
		int remainder;
		while(num > 0){
		remainder = num % 10;
		reversednumber= (reversednumber*10)+remainder;
		num = num/10;
		}
		System.out.printf("Reversed number is %d " ,reversednumber);
	}

}
