package johnny.omg.prac.design.adaptor.forobject;

public class Adaptor implements UnifyPort {
	
	private SpecialPort sp = null;
	
	public Adaptor(SpecialPort s){
		this.sp = s;
	}

	@Override
	public void unifyMethod() {
		this.sp.specialMethod();
	}

}
