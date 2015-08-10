package johnny.omg.prac.design.state;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestState {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Context c = new Context();
		c.setState(new BlueState());
		c.handle();
	}

}
