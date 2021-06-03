package package1;

import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		int arr[] = new int[15];
		int a,b,c,i,avg,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		for(i=0;i<15;i++) {
			arr[i] = sc.nextInt();
		}
		a = (arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/5;
		System.out.println("avg of fisrt 5 no: "+ a);
		b = (arr[5]+arr[6]+arr[7]+arr[8]+arr[9])/5;
		System.out.println("avg of second 5 no: "+b);
		c = (arr[10]+arr[11]+arr[12]+arr[13]+arr[14])/5;
		System.out.println("avg of third 5 no: "+ c);
		avg = (a+b+c)/3;
		result = avg;
	System.out.println("final avg is: "+ avg);						
	}

}
