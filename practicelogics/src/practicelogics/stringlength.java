package practicelogics;

public class stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		String ujjwal=("Jaava an good langguage");
		int[] usd=new int[4];
		String[] um=ujjwal.split(" ");
	    for(int i=0;i<=um.length-1;i++) {
	    	char[] ad=um[i].toCharArray();
	    	usd[i]=ad.length;
	    	
	    	
	    }
	    
	    int max=usd[0];
	    String max1=um[0];
	    for(int i=1;i<=usd.length-1;i++) {
	    if(max<usd[i]) {
	    	
	    	max=usd[i];
	    	max1=um[i];
	    	
	    }
	    
	    
	    
	   
	    
	    
	    	
	    	
	    	
	    }
	    System.out.println(max1);
	   
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		

	}

}
