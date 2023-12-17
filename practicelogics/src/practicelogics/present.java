package practicelogics;

public class present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s1="Java";
		char j='J';
		char[] ms=s1.toCharArray();
		for(int i=0;i<=ms.length-1;i++) {
			
			if(j==ms[i]) {
				
				System.out.println("The character is prsent");
				break;
			}
			
			else {
				
				
			System.out.println("The character not presen");
			}
			
		}

	}

}
