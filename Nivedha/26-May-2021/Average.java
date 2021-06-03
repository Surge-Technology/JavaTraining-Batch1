import java.util.Scanner;
class Average{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
		int n1=0;
		for(int i=0; i<=4; i++){
        	System.out.println("Enter a number:");
			arr[i] = sc.nextInt();
		n1 = n1 + arr[i];}
		int average1 = n1 /5;
		System.out.println("Average:"+average1);
		int n2=0;
		for(int i=5; i<=9; i++){
        	System.out.println("Enter a number:");
        	arr[i] = sc.nextInt();
		n2 = n2 + arr[i];}
        int average2 = n2 /5;
		System.out.println("Average:"+average2);
		int n3=0;
		for(int i=10; i<=14; i++){
        	System.out.println("Enter a number:");
        	arr[i] = sc.nextInt();
		n3 = n3 + arr[i];}
        int average3 = n3 /5;
		System.out.println("Average:"+average3);
		int total_avg=0;
		total_avg= (average1+average2+average3)/3;
		System.out.println("Total_Average:"+total_avg);
	}
}
		
		

