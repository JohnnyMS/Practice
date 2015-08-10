package johnny.omg.prac.design.visitor;

public class MyVisitor implements IVisitor {

	@Override
	public void visit(MyElementA ma) {
		ma.dosth();
		
	}

	@Override
	public void visit(MyElementB ma) {
		ma.dosth();
	}

}
