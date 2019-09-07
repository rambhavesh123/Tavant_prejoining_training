package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MValidatorWithoutSwitchTest {

	@Test
	void test() {
		MarkValidator obj=new MarkValidator();
		String result=obj.markGrade(45);
		String expected="You are Passed With Grade 'D'";
		assertEquals(result,expected);
	}

}
