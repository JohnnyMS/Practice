package johnny.omg.prac.design.template;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTemplate {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Benchmark bm = new MethodBenchmark();
		bm.benchmark();
	}

}
