package johnny.omg.prac.design.factory;

import org.junit.Before;
import org.junit.Test;

public class TestAbstractFactory {
	
	AbstractFactory af = null;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAbstractFac() {
		System.out.println("producing mail sender");
		af = new MailFactory();
		Sender s1 = af.produceSender();
		s1.send();
		System.out.println("producing sms sender");
		af = new SmsFactory();
		Sender s2 = af.produceSender();
		s2.send();
	}

}
