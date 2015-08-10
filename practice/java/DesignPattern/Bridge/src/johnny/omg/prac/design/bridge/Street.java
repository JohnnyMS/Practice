package johnny.omg.prac.design.bridge;

public class Street extends AbstractRoad {

	@Override
	public void run() {
		this.c.method();
		System.out.println("in street");
	}

}
