package johnny.omg.prac.design.decorator;

public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		System.out.println("running a concrete component");
	}

}
