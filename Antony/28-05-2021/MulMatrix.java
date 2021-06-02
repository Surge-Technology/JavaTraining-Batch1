package package1;

import java.util.Scanner;

public class MulMatrix {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values :");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
						for(int k=0;k<3;k++) {
							c[i][j] += a[i][k]*b[k][j];
												}
						System.out.print("\t"+c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
