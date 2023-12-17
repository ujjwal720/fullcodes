package practicelogics;

public class ujh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ujjwal="Amdos";
		char[] gs=ujjwal.toCharArray();
		for(int i=0;i<=gs.length-1;i++) {
			if(Character.isLowerCase(gs[i])==true) {
				
				System.out.println(Character.toUpperCase(gs[i]));
			}
			
			else {
				
				System.out.println(Character.toLowerCase(gs[i]));
			}
			
					
		}
	}

}
