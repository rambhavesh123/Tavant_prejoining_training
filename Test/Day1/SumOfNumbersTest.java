package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void test() {
		SumOfNumbers obj=new SumOfNumbers();
		int SOE=obj.SumOfEvenNumbers(10, 20);
		int SOO=obj.SumOfOddNumbers(10, 20);
		int RSOE=90;
		int RSOO=75;
		assertEquals(SOE,RSOE);
		assertEquals(SOO,RSOO);
	}

}
