import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class areacubeTest {
	areacube obj;
	int a;
	@Before
	public void setUp() throws Exception {
		obj = new areacube();
		a=4;
		
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		a=0;
	}

	@Test
	public void testAreacube() {
		assertEquals(96, obj.areacube(a));
	}

}
