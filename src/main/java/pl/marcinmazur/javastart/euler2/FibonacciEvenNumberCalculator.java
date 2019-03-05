package pl.marcinmazur.javastart.euler2;

public class FibonacciEvenNumberCalculator {

	public int sumOfFibonacciEvenNumber(int userLimit) {

		int a = 1;
		int b = 1;
		int temp;
		int sum = 0;

		while (b < userLimit) {

			System.out.print(b + " ");

			if (b % 2 == 0)
				sum += b;

			temp = b;
			b = a + b;
			a = temp;

		}

		return sum;
	}

}
