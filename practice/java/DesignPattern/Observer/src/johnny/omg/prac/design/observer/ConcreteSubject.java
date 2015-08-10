package johnny.omg.prac.design.observer;

public class ConcreteSubject extends Subject {

	@Override
	public void operation() {
		System.out.println("make some changes");
		this.notifyAllObs();
	}

}
