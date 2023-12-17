package practicelogics;

public class pate12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m;
		m=10;
		
		for(int i=1;i<=5;i++) {
			m--;
			
			for(int j=1;j<=9;j++) {
				
			if(j>=i && j<=m) {
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
