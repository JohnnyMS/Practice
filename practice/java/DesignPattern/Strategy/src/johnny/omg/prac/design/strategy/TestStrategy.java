package johnny.omg.prac.design.strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStrategy {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ExpSolver solver = new ExpSolver(new Multiply());
		System.out.println("3 * 4 = " + solver.solve("3*4"));
		solver.changeCalculator(new Plus());
		System.out.println("3 + 4 = " + solver.solve("3+4"));
	}

}
