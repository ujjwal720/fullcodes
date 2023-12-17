package practicelogics;

public class pasde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m;
		int n;
		m=5;
		n=5;
		for(int i=1;i<=4;i++) {
		   
			
			
			for(int j=1;j<=8;j++) {
			if(j>=m && j<=n) {
				System.out.print("*");
				
			}	
			
			else {
				System.out.print(" ");
			}
				
			}
			m--;
			n++;
			System.out.println();
		}
		
	  
		
		
	}

}
