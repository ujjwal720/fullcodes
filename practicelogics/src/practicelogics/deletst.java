package practicelogics;

public class deletst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String u="This is the good thing";
		int k=0;
		String[] ms=u.split(" ");
		String[] md=new String[4];
		String gf="the";
		for(int i=0;i<=ms.length-1;i++) {
			if(!ms[i].equals(gf)) {
				
				md[k]=ms[i];
				k++;
			}
		}

		String gfg=md.toString();
		System.out.println(gfg);
	}
	
	

}

