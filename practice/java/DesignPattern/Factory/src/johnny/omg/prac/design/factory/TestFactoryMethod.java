package johnny.omg.prac.design.factory;

import org.junit.Before;
import org.junit.Test;

public class TestFactoryMethod {

	private static SendFactory sf = new SendFactory();
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testProduceSender() {
		System.out.println("producing sms sender");
		Sender s1 = sf.produceSender("sms");
		s1.send();
		System.out.println("producing mail sender");
		Sender s2 = sf.produceSender("mail");
		s2.send();
		System.out.println("error producing type");
		sf.produceSender("hello");
	}

}
