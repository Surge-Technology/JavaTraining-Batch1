package Task_file;

import java.util.Scanner;

public class Sandhiya_Circle {

	public static void main1(String args[]) {
		double circumference, area;
		int radius;
		// object of the Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		radius = sc.nextInt();
		// calculating area of circle
		area = Math.PI * (radius * radius);
		// prints the calculated area
		System.out.println("The area of the circle is: " + area);
		// calculating circumference of circle
		circumference = Math.PI * 2 * radius;
		// prints the calculated circumference
		System.out.println("The circumference of the circle is: " + circumference);
	}

	public static void main(String[] args){
			int a=2, b=90, c=211, d=1, e=151, f=90;
			if ( a > b ) {
				if ( a > c ) {
					if ( a > d ) {
						if (a>e) {
							if (a>f){
								System.out.println(a+"is the Largest");	
							}
							else {
								System.out.println(f+"is the Largest");
							}						
						}					
					}            
				}
			}
			else if ( b > c ) {
				if ( b > d ) {
						if (b >e && b>f){
							System.out.println(b+"is the Largest");
						}
						else {
							System.out.println(f+"is the Largest");
						}
				}						
			}
			else if ( c>d ) {
				if ( c>e && c>f ) {
					System.out.println(c+"is the Largest");
				}	
					else {
						System.out.println(f+"is the Largest");
					}
			}
			else if ( d>e ) {
				if ( d>f ) {
					System.out.println(d+"is the Largest");
				}	
				else {
					System.out.println(f+"is the Largest");
				}
			}		
			else if ( e>f) {
					System.out.println(e+"is the Largest");
			}
			else {
					System.out.println(f+"is the Largest");
			}		
				
		}
	}
	
	