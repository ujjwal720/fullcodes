package practicelogics;

public class stringhf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ah="as";
		int count=1;
		String hello="Java Java an";
		String[] h=hello.split(" ");
		for(int i=0;i<=h.length-1;i++) {
			if(h[i]!="as") {
			for(int j=i+1;j<=h.length-1;j++) {
				
				if(h[i]==h[j]) {
					
					h[j]="as";
				}
			}
			}
			
			
			
		}
		System.out.println(h[0]);
		System.out.println(h[1]);
		System.out.println(h[2]);
		System.out.println(count);
		
		

}
}
