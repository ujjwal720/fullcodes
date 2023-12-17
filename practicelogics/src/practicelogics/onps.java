package practicelogics;

public class onps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ds fg=new ds(12);
		

	}

}

class ds extends mobile11{
	int x=8;
	
	public ds() {
		System.out.println("This is a great thing");
		
	}
	
	public ds(int n) {
		super(15);
		
		System.out.println("The following is an child class number"+n);
	}
	
	
}




class mobile11{
	int x=7;
	
public void ujjwal() {
	
	
	System.out.println("This is a good day");
	
}	
	
public mobile11() {
	
	System.out.println("This is 1 constructor");
	
}

public mobile11(String s) {
	
	System.out.println(s);
	
	
	
}

public mobile11(int s) {
	
	System.out.println("The following is an number"+s);
}

	
}