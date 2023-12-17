package practicelogics;

import java.util.ArrayList;
import java.util.List;

public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 2;
		int end = 800;
		List<Integer> z = new ArrayList<Integer>();

		for (int i = start; i <= end; i++) {
			int count = 0;
			int s = i;
			for (int j = 2; j <= s - 1; j++) {

				if (s % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				
				z.add(s);
			}

		}

		System.out.println(z);

	}

}
