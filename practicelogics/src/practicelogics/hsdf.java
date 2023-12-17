package practicelogics;

public class hsdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		////3letters permutTION
		
		String ujjwal="DEF";
		char temp;
		char[] sm=ujjwal.toCharArray();
		char[] smt=new char[6];
		int k=0;
		     for(int i=0;i<=sm.length-1;i++) {
		    	 smt[0]=sm[i];
		     
			for(int j=0;j<=smt.length-1;j++) {
				if(smt[0]!=sm[j]) {
					k++;
					smt[k]=sm[j];
					
				}
				
				
			}
			for(int r=0;r<=1;r++) {
				
				temp=smt[1];
				smt[1]=smt[2];
				smt[2]=temp;
				
				for(int m=0;m<=smt.length-1;m++) {
					
					System.out.print(smt[m]);
					
				}
				System.out.println();
				
				
			}	
			k=0;
			
	        
		     
		     }
		     
			

			
		

	
	
	

}
}
