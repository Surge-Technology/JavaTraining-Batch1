package package1;

public class Poly {

	public static void main(String[] args) {
		Audi a = new Audi();
		System.out.println(a.rate());
		Car c = new Car();
		System.out.println(c.rate());
		c = new Bmw();
		System.out.println(c.name());
		c = new Audi();
		System.out.println(c.name());


	}

}

class Car {
 int rate(String name) {
	 int rate = 0;
	 
	 if(name.equalsIgnoreCase("Bmw")) {
		 rate = 6000;
	 } else {
		 rate = 7000;
	 }
	 return  rate;
 }
 int rate(String name, int year) {
	 return 1990;
 }
 int rate() {
	 return 2000;
 }
 String name() {
	 String name ="M3401"; 
	 return name;
 }
 
}
class Bmw extends Car {
	int rate() {
		
		int rate = 0;
		if(name().equalsIgnoreCase("M340i")) {
			rate = 6000;
		}
		return rate;
	}
	String name() {
		String name = "Bmwx5";
		return name;
		
	}
}
class Audi extends Car {
	
	int rate() {
		int rate = 7000;
		return rate;
		
	}
	String name() {
		String name = "Q5";
		return name;
		
	}
}