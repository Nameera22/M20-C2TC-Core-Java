import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		Testing t=new Testing();
		int result=t.square(4);
		assertEquals(16,result);
	}

}