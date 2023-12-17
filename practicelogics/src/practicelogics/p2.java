package practicelogics;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/////ugly numbers 2,3 or 5
		
		int count=0;
		
		for(int i=2;i<=15;i++) {
			if(i%2==0||i%3==0||i%5==0) {
				
				count++;
				
			}
			
			
		}
		System.out.println(count);
		
		
		

	}

}
