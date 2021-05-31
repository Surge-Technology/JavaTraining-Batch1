package Task_file;

public class Sandhiya_square {
	int a = 10;

	public static void main(String[] args) {
		Sandhiya_square obj = new Sandhiya_square();
		System.out.println(obj.area());
		System.out.println(Sandhiya_square.criFun());

	}

	int area() {
		return (a * a);

	}

	static int criFun() {
		Sandhiya_square obj = new Sandhiya_square();
		return 4 * obj.a;

	}

}
