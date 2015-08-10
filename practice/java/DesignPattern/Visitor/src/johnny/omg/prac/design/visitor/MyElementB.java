package johnny.omg.prac.design.visitor;

public class MyElementB implements Element {

	@Override
	public void accept(IVisitor v) {
		v.visit(this);

	}

	@Override
	public void dosth() {
		System.out.println("this is B");
		
	}

}
