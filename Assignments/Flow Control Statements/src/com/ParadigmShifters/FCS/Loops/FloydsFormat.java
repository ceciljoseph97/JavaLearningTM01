/* Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  **/


package com.ParadigmShifters.FCS.Loops;

public class FloydsFormat {

	public static void main(String[] args) {
		if(args.length==0){
			System.out.println("Please enter an integer");
			}
			int num = Integer.parseInt(args[0]);
			int c,r;
			for(c =1; c<=num; c++){
			for(r =1; r<=c; r++){
			System.out.print("*"+"");
			}
			System.out.println();
			}
		
	}

}
