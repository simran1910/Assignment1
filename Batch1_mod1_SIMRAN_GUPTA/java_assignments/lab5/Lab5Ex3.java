package lab5;
import java.util.Scanner;

public class Lab5Ex3 {
	
	public static void prime(int num){
		for(int i=2;i<=num;i++) {
			int count=0;
		    for(int j=2;j<i;j++) {
			   if((i%j)==0) {
				  count++;
				  break;	
			   }
		    }
			if(count==0) {
              System.out.println(i);
		}
	}		
		
	}
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input=sc.nextInt();
		prime(input);
		sc.close();
	}


}
