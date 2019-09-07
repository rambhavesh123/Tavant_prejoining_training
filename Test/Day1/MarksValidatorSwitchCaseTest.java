package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarksValidatorSwitchCaseTest {

	@Test
	void test() {
		MarksValidatorSwitchCase obj=new MarksValidatorSwitchCase();
		String result=obj.markGrade(45);
		String expected="You are Passed With Grade 'D'";
		assertEquals(result,expected);
	}

}
