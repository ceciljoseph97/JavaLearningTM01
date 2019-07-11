/* Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a*/


package com.ParadigmShifters.FCS.IF;

public class CaseConversion {

	public static void main(String[] args) {
		char a=args[0].charAt(0);
		char b;
		if(Character.isLowerCase(a)){
		b=Character.toUpperCase(a);
		}
		else
		{
		b=Character.toLowerCase(a);
		}
		System.out.println(a+"->"+b);

	}

}
