package practicelogics;

public class pronicnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pn = 6;

		for (int i = 1; i <= pn; i++) {

			if (pn % i == 0) {

				int s = pn / i;

				if ((s - i) == 1) {

					System.out.println(pn +" "+ "is pronic number" + " " + i + "*" + s);
					break;

				}

			}

		}

	}

}
