package johnny.omg.prac.design.composite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestComposite {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Component c1 = new LeafA();
		Component c2 = new LeafB();
		Component c3 = new LeafA();
		
		CompositeComponent many = new CompositeComponent();
		many.add(c1);
		many.add(c2);
		many.add(c3);
		many.operation();
		
		Component c4 = new LeafB();
		CompositeComponent all = new CompositeComponent();
		all.add(many);
		all.add(c4);
		all.operation();
	}

}
