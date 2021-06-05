
public class Matrix {

		public static void main(String args[]){  
		   
		int a[][]={{2,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
		    
	   
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}// k loop  
		System.out.print(c[i][j]+" ");  //printing matrix element  
		}//j loop  
		System.out.println();    
		}    
		}}  


