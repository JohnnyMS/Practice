package johnny.omg.prac.design.flyweight;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FlyTest {

	FlyweightFactory ff = new FlyweightFactory();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ff.getFlyweight("f1");
		ff.getFlyweight("f2");
		ff.getFlyweight("f3");
		ff.getFlyweight("f1");
		ff.getFlyweight("f3");
	}

}
