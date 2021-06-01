
public class Patterns {

	public static void main(String[] args) {
		
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				
			}
				System.out.println();
		}
			{
				System.out.println("\n");

			}
			for(int i=1;i<=3;i++) {
				for(int j=3;j>=i;j--) {
					System.out.print("*");
				
			}
				System.out.println();
		}
			{
				System.out.println("\n");

			}
			for(int i=1;i<=3;i++) {
				for(int k=3-1;k>=i;k--) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				
			}
				System.out.print("\n");
		}
	}

}
