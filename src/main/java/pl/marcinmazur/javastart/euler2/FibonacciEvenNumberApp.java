package pl.marcinmazur.javastart.euler2;

public class FibonacciEvenNumberApp {

	public static void main(String[] args) {

		FibonacciEvenNumberCalculator fibonacciEvenNumberCalculator = new FibonacciEvenNumberCalculator();
		int sum = fibonacciEvenNumberCalculator.sumOfFibonacciEvenNumber(4000000);

		System.out.println("\n" + sum);

	}

}
