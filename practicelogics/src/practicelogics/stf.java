package practicelogics;

public class stf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String hg="Java is an Java";
	String[] hd=hg.split(" ");

	for(int i=0;i<=hd.length-1;i++) {
		if(hd[i]!="Thor") {
		for(int j=i+1;j<=hd.length-1;j++) {
			if(hd[i].equals(hd[j])) {
				System.out.println(hd[i]);
				hd[j]="Thor";
				
				
			}
			
			
		}
		}
	}
	for(int i=0;i<=hd.length-1;i++) {
	
   if(!hd[i].equals("Thor")) { 
	   System.out.println(hd[i]);
	  
  }
	
	}
	
	
	}
	
	

}
