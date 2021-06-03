class Calc{
int a=121,b=11;
	public static void main(String arg[]){
	Calc obj= new Calc();
		System.out.println("Addition:"+obj.add());
		System.out.println("Subtraction:"+obj.sub());
		System.out.println("Multiplication:"+obj.multi());
		System.out.println("Division:"+obj.div());
	}
	int add(){
	int x=a+b;
	return x;
	}
	int sub() {
	int x=a-b;
	return x;
	}
	int multi() {
	int x=a*b;
	return x;
	}
	int div() {
	int x=a/b;
	return x;
	}
	
}	
	