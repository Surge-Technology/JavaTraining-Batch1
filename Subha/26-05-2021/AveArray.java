public class AveArray {
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in); 
		
	
			System.out.println("enter the numbers:");
			
			int arr[]=new int[15];
			
			for(int i=0;i<15;i++) {
				arr[i]=s.nextInt();
			}
			float ave1=(arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/5;
			float ave2=(arr[5]+arr[6]+arr[7]+arr[8]+arr[9])/5;
			float ave3=(arr[10]+arr[11]+arr[12]+arr[13]+arr[14])/5;
			float Totalaverage=(ave1+ave2+ave3)/3;
			System.out.println(Totalaverage);
				 
		
			
	}
}

		