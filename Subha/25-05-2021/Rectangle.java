class rectangle {
int l=4;
int w=6;
	public static void main(String[] args) {
		rectangle r=new rectangle();
		r.area();
		r.circum();
		
}
int area() {
	int result=l*w;
	System.out.println("Area:"+l*w);
	return result;
}
int circum() {
	int result=2*(l+w);
	System.out.println("Circumference:"+result);
	return result;
}

}
