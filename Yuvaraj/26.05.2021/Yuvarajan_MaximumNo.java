
public class Yuvarajan_MaximumNo {

	public static void main(String[] args) {

		int []a= {1,2,3,4,5};
		int []b={6,7,8,9,10};
		int []c={11,12,13,14,15};
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int length1 = a.length;
		int length2 = b.length;
		int length3 = c.length;
			for(int i:a) {
				sum1 += i;
			
		}
			for(int j:b) {
				sum2 += j;
			
		}
			for(int k:c) {
				sum3 += k;
			
		}
			double average1 = sum1 / length1;
			double average2 = sum2 / length2;
			double average3 = sum3 / length3;
			System.out.println(average1);
			System.out.println(average2);
			System.out.println(average3);
			System.out.println("Total Average ="+(average1+average2+average3)/3);
	}
	


}