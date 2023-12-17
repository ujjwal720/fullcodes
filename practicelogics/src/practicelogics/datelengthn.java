package practicelogics;

public class datelengthn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] d1= {1,7,2019};
		int[] d2= {1,9,2020};
		int[] d3=new int[3];
		
		for(int i=0;i<=d1.length-1;i++) {
			
			d3[i]=d2[i]-d1[i];
		}
		
	System.out.print("years"+d3[0]+" "+ "month"+d3[1]+"years"+" "+d3[2]);
		

	}

}
