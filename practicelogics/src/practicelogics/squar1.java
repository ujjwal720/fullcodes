package practicelogics;

public class squar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++) {
		for(int j=1;j<=5;j++) {
			if(i==1 && j>=1 && j<=5 || i==4 && j>=1 && j<=5 || j==1 || j==5 ) {
				
				System.out.print(j);
			}
			else {
				
				System.out.print(" ");
			}
			
			
			
		}	
		
		System.out.println();
			
			
		}
		
		

	}

}
