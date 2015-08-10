package johnny.omg.prac.design.bridge;

public abstract class AbstractRoad {
	
	protected AbstractCar c;
	
	public void setCar(AbstractCar car){
		this.c = car;
	}
	
	public abstract void run();

}
