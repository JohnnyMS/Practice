package johnny.omg.prac.design.decorator;

public class Decorator implements Component {
	
	protected Component base = null;
	
	public Decorator(Component c){
		this.base = c;
	}

	@Override
	public void operation() {
		this.base.operation();
		doA();
		doB();
	}
	
	public void doA(){
	}
	
	public void doB(){
	}

}
