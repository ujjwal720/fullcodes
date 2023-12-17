package practicelogics;

public class practA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;

		for(int i=1;i<=6;i++) {
			for(int j=1;j<=3;j++) {
				
				if(i==1 && j>=1 && j<=2 || i==3 && j>=1 && j<=3 || i!=1 && j==3 || j==1) {
					
					System.out.print("*");			
				}
			
			else {
				
				System.out.print(" ");
			}
				
				 k++;
			
			
		}
			
			System.out.println(" ");
		
		
		
		
		
		
	}

}
}
