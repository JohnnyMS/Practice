package johnny.omg.prac.design.bridge;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBridge {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AbstractCar ac = new Car();
		AbstractRoad ar = new Highway();
		ar.setCar(ac);
		ar.run();
		
		ac = new Bus();
		ar.setCar(ac);
		ar.run();
		
		ar = new Street();
		ar.setCar(ac);
		ar.run();
		
		ac = new Car();
		ar.setCar(ac);
		ar.run();
	}

}
