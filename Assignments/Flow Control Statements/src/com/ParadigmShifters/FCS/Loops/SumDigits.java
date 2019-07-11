/*
Write a program to print the sum of all the digits of a given number.
Example1) 
I/P:1234
O/P:10*/
package com.ParadigmShifters.FCS.Loops;

public class SumDigits {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int sum=0;
		int r;
		for(int i=num;num!=0;num=num/10){
		r = num%10;
		sum = sum+r;
		}
		System.out.println("sum is " +sum);
		

	}

}
