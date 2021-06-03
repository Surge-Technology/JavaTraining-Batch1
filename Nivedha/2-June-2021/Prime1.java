import java.util.Scanner;
class Prime1{ 
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int number=0;
	int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
               number++;}
		if(number==2){
			System.out.println("Prime");}
		if(number==3){
			System.out.println("Prime");}
		if(number==5){
			System.out.println("Prime");}
		if(number==7){
			System.out.println("Prime");}
		if(number==9){
			System.out.println("Prime");}
		}
	}
}
	
	
                

 