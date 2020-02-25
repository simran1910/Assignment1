package lab1;

import java.util.Scanner;

public class Lab1Ex2 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int sum=Lab1Ex2.calculateDifference(n);
		System.out.println("Difference: "+sum);
	}
	public static int calculateDifference(int n) {
		int sum,sum1=0,sum2=0;
		for(int i=1;i<=n;++i) {
			sum1+=i;
			sum2+=Math.pow(i,2);
		}
		return sum=(int) (Math.pow(sum1, 2)-sum2);
	}
}
