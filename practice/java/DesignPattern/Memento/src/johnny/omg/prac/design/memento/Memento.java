package johnny.omg.prac.design.memento;

import java.io.File;

public class Memento {
	
	int i;
	File f = null;
	
	public Memento(Thing t){
		i = t.i;
		f = t.f;
	}

}
