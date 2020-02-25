package Lab3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lab3Ex3 {
		static int[] getSorted(int ar[]) {
			int ar3[]=new int[ar.length];
			int p=0;
			for(Integer i:ar) {
			    String s=new String(i.toString());
				String k=new StringBuffer(s).reverse().toString();
				ar3[p++]=Integer.parseInt(k);
			}
			Arrays.sort(ar3);
			return ar3;
		}

	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=scan.nextInt();
		int[] ar=new int[n];
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++) 
		ar[i]=scan2.nextInt();
		scan.close();
		scan2.close();
		
		int arr[]=getSorted(ar);
		for(int i=0;i<n;i++) 
			System.out.println(arr[i]);

	}

}
