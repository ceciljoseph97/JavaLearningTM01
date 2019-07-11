/* Write a Java program to find if the given number is prime or not.

Example1)
C:\>java Sample 
O/P: Please enter an integer number 

Example2)
C:\>java Sample 1
O/P:1 is neither prime nor composite

Example3)
C:\>java Sample 0
O/P: 0 is neither prime nor composite
 
Example4)
C:\>java Sample 10
O/P: 10 is not a prime number

Example5)
C:\>java Sample 7
O/P : 7 is a prime number*/


package com.ParadigmShifters.FCS.Loops;

public class PrimeOrNotFull {

	public static void main(String[] args) {
		
		if(args.length==0) System.out.println("Please enter an integer number ");
		else{int num=Integer.parseInt(args[0]);
		if(num==0) System.out.println("0 is neither prime nor composite");
		else if(num==1) System.out.println("1 is neither prime nor composite");
		else {
		boolean flag=false;
		for(int i=2; i<num/2;++i)
		{
		  if(num%i==0){
		    flag=true;
		    break;
		   }
		}
		if (!flag){
		 System.out.println(num +" is a prime number");
		}
		else{
		System.out.println(num + " is not a prime number");
		}
		
		}
		}

	}

}
