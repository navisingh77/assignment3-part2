import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class triangleareaTest {
	trianglearea obj;
	int h, b;
	@Before
	public void setUp() throws Exception {
		obj = new trianglearea();
		h = 5;
		b = 4;
	}

	@After
	public void tearDown() throws Exception {

		obj = null;
		h = 0;
		b = 0;
	}

	@Test
	public void testTrianglearea() {
		assertEquals(10, obj.trianglearea(h, b));
	}

}
