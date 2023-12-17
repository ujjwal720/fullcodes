package practicelogics;

public class perfect1 {

	public static void main(String[] args) {
		
		
		//strong number upto 3 number
int sum=0;
int pn=145;
int[] ujjwal= new int[3];
int r;
int k=0;
while(pn!=0) {	
	r=pn%10;
	ujjwal[k]=r;
	pn=pn/10;
	k++;
	
	
}
System.out.println(k);
int[] sm=new int[50];
for(int i=0;i<=ujjwal.length-1;i++) {
	int fact =1;///this creates problem
	for(int j=ujjwal[i];j>=1;j--) {
		fact=fact*j;
		
		
	}
	
	System.out.println(fact);
	sm[i]=fact;
    
}

for(int i=0;i<=sm.length-1;i++) {
	sum=sum+sm[i];
}

System.out.println(sum);
//System.out.println(ujjwal[0]);
//System.out.println(ujjwal[1]);
//System.out.println(ujjwal[2]);
//System.out.println(ujjwal[3]);


}
}


