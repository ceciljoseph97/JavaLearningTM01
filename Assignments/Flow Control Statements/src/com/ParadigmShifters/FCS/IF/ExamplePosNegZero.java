/*Write a program to check if a given integer number is Positive, Negative, or Zero. */
package com.ParadigmShifters.FCS.IF;


import java.util.*;

public class ExamplePosNegZero {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter no");
		int a = 0;
		if(sc.hasNextLine()) 
			{a=sc.nextInt();}
		else System.out.println("Enter no");
		if(a>0)
		{
		System.out.println("Number is positive");
		}
		else if(a<0)
		{
		System.out.println("Number is negative");
		}
		else
		{
		System.out.println("Number is zero");
		}

	}

}
