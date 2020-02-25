package lab5;
import java.util.Scanner;

public class Lab5Ex1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter red or yellow or green to check Signal");
		String choice=sc.nextLine();
		switch(choice) 
		{
			case "Red": 
				System.out.println("Stop");
				break;
			case "Yellow":
				System.out.println("Ready");
				break;
			case "Green":
				System.out.println("Go");
				break;
			default: 
				System.out.println("Wrong Choice");
		}
		
		sc.close();

	}

}

		