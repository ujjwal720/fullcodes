package practicelogics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class otpgenration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int u = 7564168;
		List<Integer> x = new ArrayList<Integer>();
		String j = Integer.toString(u);
		int count = 1;
		String result = "";
		for (int i = 0; i <= j.length() - 1; i++) {
			if (count % 2 == 0) {

				String h = Character.toString(j.charAt(i));
				int z = Integer.parseInt(h);
				x.add(z * z);

			}

			count++;
		}

		for (int i = 0; i <= 1; i++) {

			String h = Integer.toString(x.get(i));
			result = result + h;

		}
		
		System.out.println(result + "This is the otp of the following");

	}

}
