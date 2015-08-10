package johnny.omg.prac.design.visitor;

public interface Element {
	
	public void accept(IVisitor v);
	public void dosth();

}
