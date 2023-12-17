package practicelogics;

public class patt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=8;
		for(int i=1;i<=4;i++) {
			k--;
			
			for(int j=1;j<=7;j++) {
				if(j>=i && j<=k) {
					System.out.print("*");
					
				}
				
				else {
					System.out.print(" ");
					
					
				}
				
				
				
			}
			System.out.println();
			
			
			
		}
		
		

	}

}
