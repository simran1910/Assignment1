package lab10;

@FunctionalInterface
interface Accept{

	public boolean check(String usernam,String password);
}
public class Lab10Ex3 {

	public static void main(String[]args) {
		String username="piyushsngh636@gmail.com";
		String password="amrit";
		Accept a=(s1,s2)->{
			if(s1.equals("piyushsngh636@gmail.com") && s2.equals("amrit"));
			return true;
		};
		System.out.println(a.check(username,password));
	}
}
