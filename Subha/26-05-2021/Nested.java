public class Nested{
	public static void main(String arg[]) {
		int a=20,b=47,c=51,d=6,e=66,f=10;
		if(a>b) {
			if(a>c) {
				if(a>d) {
					if(a>e) {
						if(a>f) {
							System.out.println(a+" is greater");
						}		
		}
					else if(e>f) {
						System.out.println(e+" is greater");
					}
				}
				else if(d>e) {
					System.out.println(d+" is greater");
				}
				
			}
			else if(c>d) {
				System.out.println(c+" is greater");
			}
			
			
			else {
				System.out.println(f+" is greater");
			}
		}
		else if(b>c) {
				if(b>d) {
					if(b>e) {
						if(b>f) {
							System.out.println(b+" is greater");
						}
						
					}
					else if(e>f) {
						System.out.println(e+" is greater");
					}
					
				}
				else if(d>e) {
					System.out.println(d+" is greater");
				}
				
				else {
					System.out.println(f+" is greater");
				
				}
			}
		
		else if(c>d) {
				if(c>e) {
					if(c>f) {
						System.out.println(c+" is greater");
					}
					}
				else if(e>f) {
					System.out.println(e+" is greater");
				}
				else {
					System.out.println(f+" is greater");
				}
				}
			
			else if(d>e) {
				if(d>f) {
						System.out.println(d+" is greater");
					}
					else {
						System.out.println(f+" is greater");
					}
		}
			else if(e>f) {
				System.out.println(f+" is greater");
			}
				else if(e>f) {
						System.out.println(e+" is greater");
					}
					else {
						System.out.println(f+" is greater");
					}
	}
}
