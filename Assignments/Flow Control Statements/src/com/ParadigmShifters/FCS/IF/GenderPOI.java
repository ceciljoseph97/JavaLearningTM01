/* Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.*/

package com.ParadigmShifters.FCS.IF;

public class GenderPOI {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[1]);
		String s=args[0];
		String s1="male";
		String s2="female";
		if ((s.equalsIgnoreCase(s2)) &&  (a>=1 && a<=58)) {
		          System.out.println("percentage of interest is 8.2%");
		           }
		if ((s.equalsIgnoreCase(s2))&&(a>=59 && a<=100))
		           {
		            System.out.println("percentage of interst is 9.2%");
		            } 
		        
		if((s.equalsIgnoreCase(s1)) && (a>=1 && a<=58)){
		       System.out.println("percentage of interest is 8.4%");
		         }
		if((s.equalsIgnoreCase(s1)) && (a>=59 && a<=100))
		         {
		       System.out.println("percentage of interest is 10.5%");
		         }
	}

}
