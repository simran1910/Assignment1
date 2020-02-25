package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Ex1 {
	static int getSecondSmallest(int[] ar) {
		Arrays.sort(ar);
		int num=ar[1];
		return num;
		
	}

	public static void main(String[] args) {
		int size;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=scan.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the elements");
		for (int i=0;i<arr.length;i++) { 
		   arr[i]= scan.nextInt();
		}
		System.out.println(getSecondSmallest(arr));

	}

}
