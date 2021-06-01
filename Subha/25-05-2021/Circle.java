class Circle {
    int r=12;
	static float pi=3.14f;

	public static void main(String[] args) {
		area();
		circum();
	}

 static void area() {
	 Circle c=new Circle();
	System.out.println("Area:"+(pi)*(c.r)*(c.r));
}
static void circum() {
	 Circle c=new Circle();
	System.out.println("Circumstance:"+2*pi*c.r);
}
}