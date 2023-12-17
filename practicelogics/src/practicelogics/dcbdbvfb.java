package practicelogics;

public class dcbdbvfb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] duplicate= {1,2,3,1,2,3,1,1,2,3,4};
		int[] mk=new int[10];
		int k=0;
	for(int i=0;i<=duplicate.length-1;i++) {
		if(duplicate[i]!=-1) {
		for(int j=i+1;j<=duplicate.length-1;j++) {
		if(duplicate[i]==duplicate[j]) {
			
			duplicate[j]=-1;
			mk[i]=duplicate[i];
			
	   }	
	}
	}
	}
	System.out.println(duplicate[0]);
	System.out.println(duplicate[1]);
	System.out.println(duplicate[2]);
	System.out.println(duplicate[3]);
	System.out.println(duplicate[4]);
	System.out.println(duplicate[5]);
	System.out.println(duplicate[6]);
	System.out.println(duplicate[7]);
	System.out.println(duplicate[8]);
	System.out.println(duplicate[9]);
	System.out.println(duplicate[10]);
	System.out.println(mk[0]);
	System.out.println(mk[1]);
	System.out.println(mk[2]);
	System.out.println(mk[3]);
	
	
		
		
	}

}
