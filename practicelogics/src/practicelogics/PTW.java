package practicelogics;

public class PTW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int k;
	int m;
	k=4;
	m=4;

	
	for(int i=1;i<=4;i++) {
	
		
		for(int j=1;j<=7;j++) {
			
			if(j>=k && j<=m ) {
				
				System.out.print(j);
				
				
			}
			
			else {
				System.out.print(" ");
			}
			
			
			
		}
		k--;
		m++;
		System.out.println();
		
		
	}

	}

}
