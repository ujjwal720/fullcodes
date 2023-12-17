package practicelogics;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stubCHAR
		
		
		String ujjwal="ABCDEF";
		int count =0;
		int d=0;
		char[] us=ujjwal.toCharArray();
	    char[] ut=new char[6];
	    char[] uf=new char[6];
	    for(int i=0;i<=us.length-1;i++) {
	    ut[i]=us[i];
	    }
	    for(int j=us.length-1;j>=0;j--) {
	    	uf[d]=us[j];
	    	d++;
	    	
	    	
	    }
	    
	    for(int k=0;k<=us.length-1;k++) {
	    	if(ut[k]==uf[k]) {
	    		
	    		count++;
	    		
	    	}
	    	
	    	else {
	    		System.out.println("The number is not palindrome");
	    		break;
	    	}
	    }
	    
	   if(count==us.length) {
		   System.out.println("The string is palindrome");
	   }
 		
	   
	 
	  
		

	}

}
