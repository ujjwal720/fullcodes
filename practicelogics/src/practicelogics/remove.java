package practicelogics;

public class remove {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		
		String li="I love Java. I love Selenium. I love Testing";
		String[] ad=li.split(" ");
		String remove="I";
		int rd =0;
		int k=0;
		String[] ed= new String[9];
		for(int i=0;i<=ad.length-1;i++) {
		if(ad[i].equals("love")) {
			
			ad[i]="o";
			break;
			
		}
		
		
			
			
		}
		
		for(int i=0;i<=ad.length-1;i++) {
		if(!ad[i].equals("o")) {
			
			System.out.print(ad[i]+" ");
		}
			
		}
		
		
		
		
	
		
			
		
		
		
		
 
	}

}
