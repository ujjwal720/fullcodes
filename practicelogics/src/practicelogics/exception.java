package practicelogics;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int[] cd= {1,2,3};
			System.out.println(cd[3]);
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
		
		finally {
			System.out.println("Hello");
		}
	}

}
