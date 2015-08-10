package johnny.omg.prac.design.adaptor.forobject;

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
		
		SpecialPort sp = new SpecialPort();
		UnifyPort up2 = new Adaptor(sp);
		up2.unifyMethod();
	}

}
