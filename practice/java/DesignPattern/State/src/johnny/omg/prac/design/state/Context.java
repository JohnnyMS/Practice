package johnny.omg.prac.design.state;

public class Context {
	
	State s = null;
	
	public void setState(State s){
		this.s = s;
	}
	
	public void handle(){
		s.go();
	}

}
