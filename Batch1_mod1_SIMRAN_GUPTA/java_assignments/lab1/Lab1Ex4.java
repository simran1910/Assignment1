package lab1;

import java.util.Scanner;

public class Lab1Ex4 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		boolean check=Lab1Ex4.checkNumber(n);
	    if(check)
		    System.out.println(n+" is a power of 2");
	    else
	    	System.out.println(n+" is not a power of 2");
	}
	public static boolean checkNumber(int n) {
		int m=(int) Math.pow(2, Math.round(Math.log(n)/Math.log(2)));
	    if(m==n)
	    	return true;
	    else
	    	return false;
	}
}
