package lab10;

import java.util.function.Supplier;

class Packable{
	int rate;
	String name;
	public Packable() {
		
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Lab10Ex4 {

	public static void main(String[]args) {
		Supplier<Packable> p=Packable::new;
		
	}
}
