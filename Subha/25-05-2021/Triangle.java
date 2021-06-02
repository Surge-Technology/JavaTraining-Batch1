class triangle {
int b=8,h=10;
static int a=3,c=7;
	
public static void main(String[] args) {
	triangle t=new triangle();
	area();
	t.circum();

}
	static void area() {
		System.out.println("Area:"+(b*h)/2);
	}
	void circum() {
		System.out.println("Circumference:"+(a+b+c));
	}
}
	
