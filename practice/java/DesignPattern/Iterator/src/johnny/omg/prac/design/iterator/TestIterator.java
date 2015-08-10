package johnny.omg.prac.design.iterator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestIterator {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Collection c = new MyCollection();
		Iterator it = c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
