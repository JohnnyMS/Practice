package johnny.omg.prac.design.visitor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestVisitor {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Element e = new MyElementA();
		e.accept(new MyVisitor());
		e = new MyElementB();
		e.accept(new MyVisitor());
	}

}
