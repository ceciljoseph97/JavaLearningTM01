/*Write a program to print first 5 values which are divisible by 2, 3, and 5.*/


package com.ParadigmShifters.FCS.Loops;

public class Divi235 {

	public static void main(String[] args) {
		int count = 5;
		int n = 1;
		do
		{
		 if((n%2==0) && (n%3==0) && (n%5==0))
		  {
		  System.out.println(n);
		  count--;
		  }
		  n++;
		  
		}while(count>0);
		
	}

}
