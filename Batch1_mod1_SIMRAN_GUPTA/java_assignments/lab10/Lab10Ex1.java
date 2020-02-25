package lab10;
@FunctionalInterface
interface Lab10Assign1Cal {

	public double power(int a,int b);
}

public class Lab10Ex1{

	public static void main(String[]args) {
		Lab10Assign1Cal c1=(a,b) -> Math.pow(a,b);
		System.out.println(c1.power(3, 3));
	}
}
