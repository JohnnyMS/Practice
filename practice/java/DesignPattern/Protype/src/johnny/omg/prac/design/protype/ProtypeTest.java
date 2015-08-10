package johnny.omg.prac.design.protype;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProtypeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws CloneNotSupportedException {
		AbstractProduct ap = new ConcretProductB();
		AbstractProduct ap2 = (AbstractProduct) ap.clone();
		ap2.whoAmI();
	}

}
