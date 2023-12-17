package practicelogics;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int m=4;
int n=4;
int h=2;
int k=6;

for(int i=1;i<=7;i++) {
	if(i<=4) {
	for(int j=1;j<=7;j++) {
		if(j>=m && j<=n) {
			System.out.print("*");}
		
		
		else {
			System.out.print(" ");		}}
		
		
	}
	
	if(i>4) {
		for(int l=1;l<=7;l++) {
			if(l>=h&&l<=k) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
	}
	if(i<=4) {
		m--;
		n++;
		System.out.println();
	}

	if(i>4) {
		
		h++;
		k--;
		System.out.println();
		
		
	}


  
}




	}

}
