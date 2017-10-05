import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class volumecylinderTest {
	volumecylinder obj;
	int h,r;

	@Before
	public void setUp() throws Exception {
		obj = new volumecylinder();
		h = 5;
		r = 5;
	}

	@After
	public void tearDown() throws Exception {

		obj = null;
		h = 0;
		r = 0;
	}

	@Test
	public void testVolumecylinder() {
		assertEquals(392, obj.volumecylinder(h, r));
	}

}
