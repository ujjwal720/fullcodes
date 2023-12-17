package practicelogics;

public class duplicate12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String ujjwal="Java is an langguage";
		String ujjwal1="Java is important selenium";
		String[] hs=ujjwal.split(" ");
		String[] hs1=ujjwal1.split(" ");
		for(int i=0;i<=hs1.length-1;i++) {
			for(int j=0;j<=hs1.length-1;j++) {
				if(hs[i].equals(hs1[j])) {
					hs1[j]="js";
				}
				
			}
			
			
		}
		
		for(int i=0;i<=hs.length-1;i++) {
			if(!hs1[i].equals("js")) {
				
				System.out.println(hs1[i]);
			}
			
			
			
			
		}

	}

}
