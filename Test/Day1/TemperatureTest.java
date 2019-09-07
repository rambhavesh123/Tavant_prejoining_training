package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		CalculateTemperature obj=new CalculateTemperature();
		double actual1 = obj.convertToCelsius(100);
		double expected1 = 37.77777777777778;
		assertEquals(actual1, expected1);
		System.out.println(actual1);
		double actual2 = obj.convertToFarenheit(20);
		double expected2 = 68.0;
		System.out.println(actual1);
		assertEquals(actual2, expected2);
	}

}
