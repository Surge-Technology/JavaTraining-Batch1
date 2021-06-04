package package1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int p,n=0,i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value"); 
		p = sc.nextInt();
		n = p/2;
		if(n==0 ||n==1) {
			System.out.println("not a prime");
			
		} else {
			for(n=2;i<=n;n++) {
				if(n%2==0) {
					System.out.println("not a prime");
					i =1;
					break;
				} 
				if(i==0) {
					System.out.println("prime");
				}
				
			}
			
		}
		
			
		
			
		
	
	

	}

}
