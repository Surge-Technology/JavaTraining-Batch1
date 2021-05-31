import java.util.Scanner;

public class MultiDimension {

	public static void main(String[] args) {

		int[][][]a = new int[3][3][3];
		int[][][]b = new int[3][3][3];
		int[][][]c = new int[3][3][3];
		int[][][]d = new int[3][3][3];
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Please enter the value for 3*3 matrix");
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				for(int k =0;k<3;k++) {
					a[i][j][k]=ob.nextInt();
				}
			}
		}
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				for(int k =0;k<3;k++) {
					b[i][j][k]=ob.nextInt();
				}
			}
		}
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				for(int k =0;k<3;k++) {
					c[i][j][k]=ob.nextInt();
				}
			}
		}
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				for(int k =0;k<3;k++) {
					d[i][j][k]=a[i][j][k]+b[i][j][k]+c[i][j][k];
				}
			}
		}
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				for(int k =0;k<3;k++) {
					d[i][j][k]=a[i][j][k]+b[i][j][k]+c[i][j][k];
					System.out.print("\t"+d[i][j][k]);
				}
				System.out.println(" ");
	}

}
	}
}
