package lab4;

import java.util.Scanner;

public class Lab4Ex1{
	public static int getCube(int num){
		int cube=0;
		while(num>0){
			int temp=num%10;
			cube+=(temp*temp*temp);
			num=num/10;	
			}
		return cube;
		}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int input=sc.nextInt();
		System.out.println(getCube(input));
		sc.close();
	}

}
