import java.util.Scanner;
class Array{
	
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int roll_no[] = { 101,102,103,104,105,106,107,108,109,110};
        String std_names[] = { "Vimala", "Arun", "Gopi", "Radha", "Siva","Amala","Ashwin","Shalini","Divya","Raja" };
        String phone_no[] = { "9876282234","987465325","8976467246","7896543287","8742357908","7126443768","9012754369","8754324676","8799654321","9876543210"};
		
		for(int i=0;i<=9;i++){
		System.out.print("Enter a number from 101 to 110: ");
		int a = sc.nextInt();
		int index = findIndex(roll_no,a);
		
	    System.out.println("Roll_number: " + roll_no[index]);
	    System.out.println(" Name:" + std_names[index] );
		System.out.println(" Phone_number :" + phone_no[index]);}
	}
}