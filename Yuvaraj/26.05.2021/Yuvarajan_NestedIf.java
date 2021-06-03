
public class Yuvarajan_NestedIf {
	public static void main(String[] args) {
		int a = 5645, b = 299964, c = 75454, d = 678,e=4,f=1115;
		int result = 0;
		if (a > b) {
		    if (a > c && a > d && a>e&& a>f) {
		        result = a;
		    } else {
		        if (c > d&& c>e&&c>f) {
		            result = c;
		        } else {
		        	if(d>b&&d>c&&d>e&&d>f) {
		        		result =d;
		        	}else {
		        		if(e>f) {
		        			result =e;
		        		}else {
		        			result = f;
		        		}
		        	}
		           
		        }
		    }
		} else {
		    if (b > c && b > d && b>e&& b>f) {
		        result = b;
		    } else {
		        if (e > f) {
		            result = e;
		        } else {
		            result = f;
		        }
		    }
		}

		System.out.println("Biggest Num Yuvarajan= "+result);
    }
} 
