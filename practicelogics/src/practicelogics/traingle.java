package practicelogics;

public class traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
			if( i==5 && j>=1 && j<=5 ||j==1 || i!=1 && j==k  ) {
				
				System.out.print("*");
				
				
				
			}
			
			else {
				System.out.print(" ");
		   
			}
			
			
				
			}
			
			System.out.println();
			if(i>1) {
				
				k++;
			}
			
			
			
		}
		
		
 
	}

}
