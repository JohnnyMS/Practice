package johnny.omg.prac.design.proxy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestProxy {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		User u = new Admin();
		u.run();
		
		u = new Client();
		u.run();
	}

}
