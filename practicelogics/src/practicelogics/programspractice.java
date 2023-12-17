package practicelogics;

public class programspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * pwc coding questions
		 */

		String s = "Big is an boy";
		String result = "";
		String[] y = s.split(" ");
		for (int i = 0; i <= y.length - 1; i++) {

			String result1 = y[i];

			result = result + result1.charAt(0);

		}
		
		System.out.println(result);

	}

}
