package package1;

public class Pattern {

	public static void main(String[] args) {
		int i,j;
		for(i=0;i<3;i++) {
			for(j=i;j<3;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		System.out.println("____________________");
		System.out.println();
	for (i=0;i<3;i++) {
		for(j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("_____________________");
	for(i=0;i<3;i++) {
		System.out.println("\t");
		System.out.println(" ");
		for(j=0;j<=i;j++) {
			System.out.print("\t*");
			
		
		}
		System.out.println();
	}
		
		
	 
	
	}
}
