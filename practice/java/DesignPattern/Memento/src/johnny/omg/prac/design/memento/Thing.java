package johnny.omg.prac.design.memento;

import java.io.File;

public class Thing {
	
	int i;
	File f = null;
	
	public Memento getMemento(){
		return new Memento(this);
	}
	
	public void setMemento(Memento m){
		i = m.i;
		f = m.f;
	}
	
	

}
