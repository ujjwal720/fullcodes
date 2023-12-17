package practicelogics;

public class zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] array1= {1,2,3,0,1,2,3,0,5,0,1,2,3};
		int[] array=new int[13];
		int k=0;
		for(int i=0;i<=array1.length-1;i++) {
        if(array1[i]!=0) {
        array[k]=array1[i];
        k++;
        
        }
       
        }
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
			
			
		
		

	}

}
