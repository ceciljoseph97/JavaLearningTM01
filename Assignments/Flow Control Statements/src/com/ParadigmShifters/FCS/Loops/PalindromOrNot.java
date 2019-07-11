/*Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome*/


package com.ParadigmShifters.FCS.Loops;

public class PalindromOrNot {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int k = num;
		int reversednumber=0;
		int remainder;
		while(num>0){
		remainder = num%10;
		reversednumber = (reversednumber*10)+remainder;
		num= num/10;
		}
		if(reversednumber==k){
		System.out.println(k+" is palindrome");
		}
		else{
		System.out.println(k+"  is not palindrome");
		}
	}

}
