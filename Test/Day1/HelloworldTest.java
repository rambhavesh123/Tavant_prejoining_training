package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloworldTest {

	@Test
	void test() {
		Helloworld obj=new Helloworld();
		String actual=obj.getMessage();
		String str="Hello World!";
		assertEquals(actual,str);
	}

}
