package practicelogics;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ArrayList<String> gs=new ArrayList<String>();
		gs.add("Ujjwal");
		gs.add("Mam");
		gs.add("Shrivastava");
		gs.add("Haridavar");
		System.out.println(gs.size());
        System.out.println(gs.get(0));
        for(int i=0;i<=gs.size()-1;i++) {
        	
        	System.out.println(gs.get(i));
        }
	
        for(String i:gs) {
        	System.out.println(i);
        	
        }
        
        

}
}
