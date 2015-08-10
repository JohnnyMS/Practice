package johnny.omg.prac.design.protype;

public class Part implements Cloneable{
	
	String a = "part";
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
