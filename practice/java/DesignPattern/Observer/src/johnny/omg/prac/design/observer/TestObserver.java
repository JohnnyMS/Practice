package johnny.omg.prac.design.observer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestObserver {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Subject s = new ConcreteSubject();
		s.add(new ObserverA());
		s.add(new ObserverB());
		s.operation();
	}

}
