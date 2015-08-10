package johnny.omg.prac.design.adaptor.forinterface;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAdaptor {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		UnifyInterface ui = new SpecialClass1();
		ui.method1();
		ui.method2();
		ui.method3();
		
		ui = new SpecialClass2();
		ui.method1();
		ui.method2();
		ui.method3();
	}

}
