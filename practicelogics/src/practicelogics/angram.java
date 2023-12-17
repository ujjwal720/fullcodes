package practicelogics;

public class angram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String u1="Silent";
		String u2="lentSi";
		int count=0;
		char[] st=u1.toCharArray();
		char[] stt=u2.toCharArray();
		for(int i=0;i<=st.length-1;i++) {
			
			for(int j=0;j<=st.length-1;j++) {
				if(st[i]==stt[j]) {
					count++;
					
				}
				
				
				
			}
			
		   
			
			
			
		}
		
		System.out.println(count);
		System.out.println(st.length);
		
		if(count==st.length) {
			
			System.out.println("The number is angram");
			
		}
		
		
	}

}
