package practicelogics;

public class count2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 22;
		int count = 0;
        
		for (int i = a; i <= b; i++) {
			int c = i;
			String y = Integer.toString(c);
			String[] l = y.split("");
			for (int j = 0; j <= l.length - 1; j++) {
				if (l[j].equals("2")) {
					count++;
				}

			}

		}

		System.out.println(count);

	}

}
