/* Write a program to receive a color code from the user (an Alphabhet). 

The program should then print the color name, based on the color code given. 

The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 

If color code provided by the user is not valid then print "Invalid Code". */


package com.ParadigmShifters.FCS.Switch;

public class ColorCode {
	public static void main(String[] args) {
		char c1=args[0].charAt(0);
		switch(c1){
		   case 'R':
		      System.out.println("RED");
		      break;
		   case 'B':
		      System.out.println("BLUE");
		      break;
		   case 'G':
		      System.out.println("Green");
		       break;
		   case 'O':
		       System.out.println("Orange");
		       break;
		   case 'Y':
		       System.out.println("Yellow");
		       break;
		   case 'w':
		       System.out.println("White");
		       break;
		   default:
		      System.out.println("Invalid code");
		      break;
		      }
		
	}

}
