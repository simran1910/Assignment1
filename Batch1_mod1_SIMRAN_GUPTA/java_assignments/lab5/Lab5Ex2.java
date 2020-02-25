package lab5;
import java.util.Scanner;

public class Lab5Ex2 {
	
	public static int fibonacci(int num) {
		int num1=1;
		int num2=1;
		int ar[]=new int[num];
		ar[0]=num1;
		ar[1]=num2;
		int i=2,temp=0;
		while(i<num) {
			temp=num1+num2;
			ar[i]=temp;
			num1=num2;
			num2=temp;
			i++;
		}
		return ar[num-1];
	}
	
	public static int recursiveFibonacci(int num) {
		if(num==0) 
		{
			return 0;
		}
		else if(num==1) 
		{
			return 1;
		}
		else 
		{
			return (recursiveFibonacci(num-1)+recursiveFibonacci(num-2));
		}
	}
	public static void main(String args[]) {
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println(fibonacci(input));
		System.out.println(recursiveFibonacci(input));
	}



}
