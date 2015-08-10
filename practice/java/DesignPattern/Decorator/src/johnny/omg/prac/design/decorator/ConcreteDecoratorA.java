package johnny.omg.prac.design.decorator;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public void doA(){
		System.out.println("with decorator A in first method");
	}

	public void doB(){
		System.out.println("with decorator A in second method");
	}
}
