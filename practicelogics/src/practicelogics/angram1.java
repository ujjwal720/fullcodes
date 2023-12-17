package practicelogics;

public class angram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "army";
		String b = "mary";
		int count = 0;
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		for (int i = 0; i <= c.length - 1; i++) {
			for (int j = 0; j <= c.length - 1; j++) {
				if (c[i] == d[j]) {
					count++;

				}

			}

		}
		if (count == c.length) {
			System.out.println("The number is angram");
		} else {
			System.out.println("The numbe ris not angram");
		}

	}
}
