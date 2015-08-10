package johnny.omg.prac.design.command;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCommand {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Invoker iv = new Invoker();
		iv.setCommmand(new MyCommand(new Receiver()));
		iv.executeOrder();
	}

}
