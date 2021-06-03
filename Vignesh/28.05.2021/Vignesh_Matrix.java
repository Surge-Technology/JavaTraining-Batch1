import java.util.Scanner;

class Vignesh_Matrix{
	public static void main (String[] args){
		int[][] a = new int [3][3];
		int[][] b = new int [3][3];
		int[][] multiplication = new int [3][3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter 3 x 3 vales for Matrix multiplication");
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				a[i][j] = input.nextInt();
			}
		}
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				b[i][j] = input.nextInt();
			}
		}
	
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<3; k++){
				multiplication[i][j] += a[i][k] * b[k][j];
			}
							System.out.print("\t" + multiplication[i][j]);

			}
							System.out.println("");

		}
	}
		
	
}