package package1;

public class AntoNested {

	public static void main(String[] args) 
	{
		int a=2144, b=992153, c= 99931, d=146, e=9957, f=5557;
		if(a>b) {
			if(a>c) {
				if(a>d) {
					if(a>e) {
						if(a>f) {
							System.out.println(a);
						} else {
							System.out.println(f);
						}
					} else if(e>f) {
						System.out.println(e);
					} else {
						System.out.println(f);
					} 
				} else if(d>e) {
					System.out.println(d);
				}else {
					System.out.println(e);
				}
			}else if(c>d) {
				System.out.println(c);
			} else {
				System.out.println(d);
			}
		} else if(b>c) {
			if(b>d) {
				if(b>e) {
					if(b>f) { 
					System.out.println(b);
				} else {
					System.out.println(f);
				}
			} else if(e>d) {
				System.out.println(e);
			} else {
				System.out.println(d);
			}
		} else if (c>d) {
			System.out.println(c);
		} else {
			System.out.println(d);
			
		}
			
	} else if(c>d) {
		if(c>e) {
			if(c>f) {
				System.out.println(c);
			} else {
				System.out.println(f);
			}
		} else if(d>e) {
			System.out.println(d);
		} else {
			System.out.println(e);
		}
	}else if (d>e) {
		if(d>f) {
			System.out.println(d);
		} else {
			System.out.println(f);
		}
		
	} else if(e>f) {
		System.out.println(e);
	} else {
		System.out.println(f);
	}
	}
		
}