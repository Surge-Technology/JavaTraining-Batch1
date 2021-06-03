class TriangleCalculation{
int a=8, b=5, c=5;
}
class Perimeter{
	void perimeter(){
		TriangleCalculation Tri = new TriangleCalculation();
		System.out.println(Tri.a+Tri.b+Tri.c);
	}
}
class Area{
	void area(){
		TriangleCalculation Tri = new TriangleCalculation();
		System.out.println((Tri.a*Tri.b)/2);
	}
}

class Vignesh_Triangle{
	public static void main(String args[]){
		Perimeter perimeterTriangle = new Perimeter();
		perimeterTriangle.perimeter();
		
		Area areaTriangle = new Area();
		areaTriangle.area();
	}
	
}