package pl.marcinmazur.javastart.euler2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciEvenNumberCalculatorTest {
	
	FibonacciEvenNumberCalculator fibonacciEvenNumberCalculator = new FibonacciEvenNumberCalculator();

	@Test
	public void shouldReturn4613732() {

		// given
		int range = 4000000;
		int expectedResult = 4613732;
		
		// when
		int result = fibonacciEvenNumberCalculator.sumOfFibonacciEvenNumber(range);
		
		// then		
		assertThat(result, is(expectedResult));
		
	}
	
	@Test
	public void shouldReturn10() {

		// given
		int range=10;
		int expectedResult = 10;
		
		// when
		int result = fibonacciEvenNumberCalculator.sumOfFibonacciEvenNumber(range);
		
		// then		
		assertThat(result, is(expectedResult));
		
	}
	
	@Test
	public void shouldReturn44() {

		// given
		int range = 100;
		int expectedResult = 44;
		
		// when
		int result = fibonacciEvenNumberCalculator.sumOfFibonacciEvenNumber(range);
		
		// then		
		assertThat(result, is(expectedResult));
		
	}
	
	@Test
	public void shouldReturn798() {

		// given
		int range = 1000;
		int expectedResult = 798;
		
		// when
		int result = fibonacciEvenNumberCalculator.sumOfFibonacciEvenNumber(range);
		
		// then		
		assertThat(result, is(expectedResult));
		
	}

}
