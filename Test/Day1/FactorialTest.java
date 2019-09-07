package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Factorial obj=new Factorial();
		int calculatedvalue=obj.FactorialOFNumis(6);
		int Expected=720;
		assertEquals(calculatedvalue,Expected);
	}

}
