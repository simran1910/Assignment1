package lab1;

import java.util.Scanner;

public class Lab1Ex3 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		boolean check=Lab1Ex3.checkNumber(number);
		if(check)
		    System.out.println(number+" is an increasing number");
		else
			System.out.println(number+" is not an increasing number"); 
	}
	public static boolean checkNumber(int number) {
		int f=0;
		char ch;
		String num=Integer.toString(number);
		for(int i=0;i<num.length()-1;i++) {
			ch=num.charAt(i);
			if(ch>num.charAt(i+1))
				{
				f=1;
				break;
				}
			
		}
		if(f==1)
			return false;
		else
			return true;
	}
}
