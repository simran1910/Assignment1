package lab6;

import java.util.Scanner;

public class Lab6Ex3 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		String s=Lab6Ex3.getImage(str);
		System.out.println("output: "+s);
	}
	public static String getImage(String str) {
		StringBuffer str1=new StringBuffer();
		String s="";
		str1.append(str);
		str1.append("|");
		s=str1.reverse().toString();
		return str.concat(s);
	}
}
