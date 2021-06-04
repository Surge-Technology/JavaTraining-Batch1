//Polymorphism...
class Polymorphism{
	public static void main(String args[]){
	Polymorphism p = new Polymorphism();
	p.add(5,10);
	p.add(5,5.654);
	p.add(5,10,15);}
	
	void add(int x,int y){
	int z=x+y;
	System.out.println("Addition:" +z);}
	
	void add(int a, double b){
	double c=a+b;
	System.out.println("Addition:" +c);}
	
	void add(int x,int y,int z){
	int d=x+y+z;
	System.out.println("Addition:" +d);}
	
}

//Inheritance: Single Inheritance.
class Parent{
	void add(){
	int a=23,b=33;
	int c=a+b;
	System.out.println("Addition:" +c);}
	
class Child extends Parent{
	void sub(){
	int x=73,y=37;
	int d=x-y;
	System.out.println("Subtraction:" +d);}}
	
public static void main(String args[]){
	Child obj = new Child();
	obj.add();
	obj.sub();
	}
}

// Multi-level Inheritance
class A2{
	public static void main(String args[]){
	C2 ob2 = new C2();
	ob2.add();
	ob2.mul();
	ob2.div();}
	
	void add(){
	int a=13,b=10;
	int c=a+b;
	System.out.println("Addition:" +c);}
	
class B2 extends A2{
	void mul(){
	int a=13,b=7;
	int d=a*b;
	System.out.println("Multiplication:" +d);}}
	
class C2 extends B2{
	void div(){
	int x=140,y=5;
	int z=x/y;
	System.out.println("Division:" +z);}}
}

//Hierarchical Inheritance
class A3{
	public static void main(String args[]){
	C3 ob3 = new C3();
	ob3.add();
	ob3.mod();}
	
	void add(){
	int a=13,b=10;
	int c=a+b;
	System.out.println("Addition:" +c);}
	
class B3 extends A3{
	void mul(){
	int a=12,b=5;
	int d=a*b;
	System.out.println("Multiplication:" +d);}}
	
class C3 extends A3{
	void mod(){
	int x=140,y=5;
	int z=x%y;
	System.out.println("Modulus:" +z);}}
}





