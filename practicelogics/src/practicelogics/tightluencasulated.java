package practicelogics;

public class tightluencasulated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bm a=new bm();
		System.out.println(a.z);

	}

}

class ac {

	private int x = 10;
}

class ad extends ac {

	int x = 15;
}

class bm extends ad {

int z = 15;
}