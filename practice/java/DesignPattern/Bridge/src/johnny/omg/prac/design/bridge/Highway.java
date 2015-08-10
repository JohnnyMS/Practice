package johnny.omg.prac.design.bridge;

public class Highway extends AbstractRoad {

	@Override
	public void run() {
		this.c.method();
		System.out.println("in highway");
		
	}

}
