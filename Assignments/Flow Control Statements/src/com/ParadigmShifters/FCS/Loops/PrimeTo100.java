/*Write a program to print prime numbers between 10 and 99.*/


package com.ParadigmShifters.FCS.Loops;

public class PrimeTo100 {
	public static void main(String args[]) {
		int a=10;
		int b=99;
		while(a<b){
			boolean flag = false;
			for(int i=2;i<(a/2);i++){
		    if(a%i == 0){
		        flag = true;
		        break;
		    }
		    }
		    if(flag != true){
				  System.out.println(a);
			}
		    a = a+1;
		}			  	
		}
	}

