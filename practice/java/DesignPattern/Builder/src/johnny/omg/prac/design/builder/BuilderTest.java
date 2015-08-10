package johnny.omg.prac.design.builder;

import org.junit.Before;
import org.junit.Test;

public class BuilderTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Builder b = new ConcretBuilderA();
		Director d = new Director(b);
		d.construct();
		Product p = b.getResult();
	}

}
