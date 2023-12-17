package practicelogics;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {1,2,3,1,4,5,6};
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]!=0) {
			for(int j=i+1;j<=array.length-1;j++) {
				
				if(array[i]==array[j]) {
					System.out.println(array[i]);
					array[j]=-1;
					
					
				}
				
				
			}
			}
			
			
			
			
		}
		
		
		

	}

}
