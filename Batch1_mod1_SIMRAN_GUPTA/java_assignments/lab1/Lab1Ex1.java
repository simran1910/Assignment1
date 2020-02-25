package lab1;

import java.util.Scanner;

public class Lab1Ex1 {

	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n: ");
	int n=sc.nextInt();
	int sum=Lab1Ex1.calculateSum(n);
	System.out.println("Sum of firt n numbers divisible by 3 or 5 : "+sum);
	}
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if((i%3==0) || (i%5==0)) {
				sum+=i;
			}
		}
		return sum;
	}
}
