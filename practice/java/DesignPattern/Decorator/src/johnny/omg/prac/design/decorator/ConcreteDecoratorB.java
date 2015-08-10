package johnny.omg.prac.design.decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component c) {
		super(c);

	}
	
	public void doA(){
		System.out.println("with decorator B in first method");
	}

	public void doB(){
		System.out.println("with decorator B in second method");
	}
}
