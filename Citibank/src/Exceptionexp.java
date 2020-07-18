
public class Exceptionexp {

	public static void main(String[] args) {
		System.out.println("Beginning");
		try {
			int i[] = new int[4];
			i[5] = 100;
			System.out.println("Ending");

		} catch(Exception e) {
			System.out.println("Error Occured");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

