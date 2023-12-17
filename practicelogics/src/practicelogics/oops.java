package practicelogics;

public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobile gs=new mobile(5);
		gs.mobile="Iphone";
		gs.ujjwal(89,90);
		gs.single(9, "Ujjwal");
		gs.ujjwal();
		System.out.println(mobile.y);
		
		

	}

}


class mobile{
	String mobile;
	int count;
	
	
public void ujjwal(int  a,int d) {
	
	
	System.out.println("i have total 5 mobile");
	System.out.println(a);
	System.out.println(d);
}

public void single(int a,String g) {
	System.out.println(a);
	System.out.println(g);
	System.out.println("name:"+mobile);
	System.out.println("count"+count);
	
}

public void ujjwal() {
	
	System.out.println("This is a very great day");
}

static int y;
public mobile(int r) {
	y++;
	System.out.println("This is a good time");
	System.out.println(r);
	
}
}


