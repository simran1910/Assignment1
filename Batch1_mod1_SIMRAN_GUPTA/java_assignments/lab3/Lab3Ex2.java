package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Ex2 {
	static void sortString(String[] ar) {
	
		//Arrays.sort(ar);
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if((ar[i].compareToIgnoreCase (ar[j])) >0) {
					String temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		if(ar.length %2!=0) {
		for(int k=0;k<=ar.length/2;k++)
			System.out.println(ar[k].toUpperCase());
		
		for(int p=ar.length/2 +1;p<ar.length;p++)
			System.out.println(ar[p].toLowerCase());
		}
		else {
			for(int k=0;k<ar.length/2;k++)
				System.out.println(ar[k].toUpperCase());
			
			for(int p=ar.length/2 ;p<ar.length;p++)
				System.out.println(ar[p].toLowerCase());
		}	
		
	}

	public static void main(String[] args) {
		int size;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=scan.nextInt();
		
		String[] arr=new String[size];
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter the elements");
		for (int i=0;i<size;i++) { 
		   arr[i]= scan2.nextLine();
		}
		scan.close();
		scan2.close();
		sortString(arr);


	}

}
