package practicelogics;

public class z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=5;j++) {
			if(i==5 && j>=1 && j<=5 || i==1 && j>=1 && j<=5 || j==i) {
				
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