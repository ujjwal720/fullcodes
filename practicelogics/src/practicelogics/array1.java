package practicelogics;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] dm= {1,2,3,4,5,6,7,8,9};
	int[] sk=new int[8];
	var delete=2;
	for(int i=2;i<=7;i++) {
		
            sk[i]=dm[i+1];
}
	
	
	///
    sk[1]=dm[delete-1];
    sk[0]=dm[delete-1-1];
    
    System.out.println(sk[0]);
    System.out.println(sk[1]);
    System.out.println(sk[2]);
	System.out.println(sk[3]);
	System.out.println(sk[4]);
	System.out.println(sk[5]);
	System.out.println(sk[6]);
	System.out.println(sk[7]);
	System.out.println(sk.length);
		
	

	
	
	
	

	}

}
