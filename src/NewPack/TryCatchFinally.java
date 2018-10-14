package NewPack;

public class TryCatchFinally {

	public static void main(String[] args) {
		int a = 10;
		try {

			System.out.println(a / 0);

		} catch (Exception e) {

			System.out.println(e);
		} finally {
			System.out.println("we are into finally");
		}


	}

}
