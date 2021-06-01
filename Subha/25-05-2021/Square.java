class square {
	int a=6;

	public static void main(String[] args) {
		area();
		circum();
	}
	static void area() {
		square s=new square();
		System.out.println("Area:"+(s.a*s.a));
	}
	static void circum() {
		square s=new square();
		System.out.println("Circumference:"+(4*(s.a)));
	}

}
