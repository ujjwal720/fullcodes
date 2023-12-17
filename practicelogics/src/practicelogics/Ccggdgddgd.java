package practicelogics;

public class Ccggdgddgd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] hs= {1,2,3,-1,-1,-2,-2,-4,-5};
int k=0;
int[] hsd=new int[9];
for(int i=0;i<=hs.length-1;i++) {
	if(hs[i]<0) {
	
      hsd[k]=hs[i];
      k++;
}
}
for(int j=0;j<=hs.length-1;j++) {
	if(hs[j]>0) {
		
		hsd[k]=hs[j];
		k++;
		
		
		
	}
	
	
	
}

System.out.println(hsd[6]);




		
		
		
		
		
		
		
	}

}
