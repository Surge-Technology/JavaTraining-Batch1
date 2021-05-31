package Task_file;

public class Sandhiya_FindBiggervalue {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 40, e = 50, f = 60;
		if (a > b) {
			if (a > c) {
				if (a > d) {
					if (a > e) {
						if (a > f) {
							System.out.println(a +" "+ "is the Largest");
						} else {
							System.out.println(f + " "+"is the Largest");
						}
					}
				}
			}
		} else if (b > c) {
			if (b > d) {
				if (b > e && b > f) {
					System.out.println(b +" "+ "is the Largest");
				} else {
					System.out.println(f + " "+"is the Largest");
				}
			}
		} else if (c > d) {
			if (c > e && c > f) {
				System.out.println(c +" "+ "is the Largest");
			} else {
				System.out.println(f +" "+ "is the Largest");
			}
		} else if (d > e) {
			if (d > f) {
				System.out.println(d +" "+ "is the Largest");
			} else {
				System.out.println(f +" "+ "is the Largest");
			}
		} else if (e > f) {
			System.out.println(e +" "+ "is the Largest");
		} else {
			System.out.println(f + " "+"is the Largest");
		}

	}
}
