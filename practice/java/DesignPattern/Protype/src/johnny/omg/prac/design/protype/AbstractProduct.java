package johnny.omg.prac.design.protype;

public abstract class AbstractProduct implements Cloneable{
	protected int a;
	protected Part b;
	
	public Object clone() throws CloneNotSupportedException{
		AbstractProduct ap = (AbstractProduct) super.clone();
		if(ap.b != null){
			ap.b = (Part) b.clone();
		}
		
		return ap;
	}
	
	public void whoAmI(){
		System.out.println(a);
	}

}
