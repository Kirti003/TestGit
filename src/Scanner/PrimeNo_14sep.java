package Scanner;

public class PrimeNo_14sep {

	public static void main(String[] args) {
		int i;
		int endPoint = 100;

		PrimeNo_14sep pn = new PrimeNo_14sep();

		// loop 1 to endPoint
		for (i = 2; i <= endPoint; i++) {

			pn.CheckPrimeNumber(i);

		}
	}

	public void CheckPrimeNumber(int numberToCheck) {
		int remainder;
		int count = 0;
		for (int i = 2; i <= numberToCheck/2; i++) {
			remainder = numberToCheck % i;

			if (remainder == 0) {
				count++;

			}

		}
		if (count == 0) {
			System.out.println(numberToCheck + " is prime");
		}

	}

}
