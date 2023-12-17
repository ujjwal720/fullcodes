package practicelogics;

public class lldm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {2,4,6,8,10,3,5,7,9,11};
		int[] array1=new int[5];
		int[] array3=new int[5];
		int j=0;
		int k=0;
	for(int i=0;i<=array.length-1;i++) {
		if(array[i]%2==0) {
			array1[j]=array[i];
			j++;}}
	
	for(int t=0;t<=array.length-1;t++) {
		
		if(array[t]%2!=0) {
		array3[k]=array[t];
			k++;
		}
		
		
	}
	
	
	System.out.println(array3[0]);
	System.out.println(array3[1]);
	System.out.println(array3[2]);
	System.out.println(array3[3]);
	System.out.println(array3[4]);
		
		
		
		
		

	}

}
