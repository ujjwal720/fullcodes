package practicelogics;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String hs="Java is an good langguage";
		String[] hsd=hs.split(" ");
		int c;
		
		for(int i=0;i<=hsd.length-1;i++) {
			String a=hsd[i].toString();
			int b=a.length();
			if(b%2==0) {
				System.out.println(hsd[i]);
			}
			
		}
		

	}

}
