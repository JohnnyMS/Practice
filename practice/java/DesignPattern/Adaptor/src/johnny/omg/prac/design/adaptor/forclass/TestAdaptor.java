package johnny.omg.prac.design.adaptor.forclass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAdaptor {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		UnifyPort up1 = new ConcreteUnifyPort();
		up1.unifyMethod();
		
		UnifyPort up2 = new Adaptor();
		up2.unifyMethod();
	}

}
