package johnny.omg.prac.design.decorator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDecorator {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Component c = new ConcreteComponent();
		Decorator d1 = new ConcreteDecoratorA(c);
		d1.operation();
		
		Decorator d2 = new ConcreteDecoratorB(d1);
		d2.operation();
		
	}

}
