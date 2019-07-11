/*
 Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.*/

package com.ParadigmShifters.FCS.IF;
public class AlphaCheck {

	public static void main(String[] args) {
		char c1='$';
		if((c1>=65 && c1<=90) || (c1>=97 && c1<=122))		
		System.out.println("Alphabet");		
		else if(c1>=48 && c1<=57)		
		System.out.println("Digit");		
		else		
		System.out.println("Special character");
		

	}

}
