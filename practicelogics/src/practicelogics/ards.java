package practicelogics;

public class ards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] ars= {1,2,3,4,5};
int[] arst= {97,4,70,80,90};
int[] arss= {4,2,65,43,41};
int[] arf=new int[3];
int k=0;
for(int i=0;i<=ars.length-1;i++) {
	for(int j=0;j<=arst.length-1;j++) {
		if(ars[i]==arst[j]) {
			arf[k]=arst[j];
		      k++;
}
}
}
for(int a=0;a<=ars.length-1;a++) {
	for(int b=0;b<=arss.length-1;b++) {
		if(ars[a]==arss[b]) {
			arf[k]=arss[b];
			k++;}}}
for(int c=0;c<=arf.length-1;c++) {
	if(arf[c]!=-1) {
	for(int d=c+1;d<=arf.length-1;d++) {
		if(arf[c]==arf[d]) {
			arf[d]=-1;
			
		}
		
		
	}
	
	
	
	
}



		
		
}

for(int i=0;i<=arf.length-1;i++) {
	if(arf[i]!=-1) {
		
		System.out.println(arf[i]);
	}
	
	
}






	}

}
