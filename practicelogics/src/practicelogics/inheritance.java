package practicelogics;

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      //  mf gs=new mf(1,2);
		father gf=new father(3,1);
		gf.bmw();
	     
		
		

	}

}

class father extends mf{
	 public  father (int a,int c) {
		super(a,c);
			 
		System.out.println(a+c); 
		 
	}
	 
	 public void bmw() {
		 
		 System.out.println("This is the bad car");
	 }
	 
	 
		
		
		
	}
	
	





class mf{
	
public void bmw() {
	
	System.out.println("This is a great day");
}

public void audi() {
	
	System.out.println("This is also a good car");
}

public mf() {
	
	System.out.println("This day is good");
}

public mf(int a,int b) {
	
	System.out.println("This is the addition of the following"+a+b);
}
	


	
}