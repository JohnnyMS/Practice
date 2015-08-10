package johnny.omg.prac.design.observer;

import java.util.ArrayList;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public abstract class Subject implements Observable {
	
	ArrayList<Observer> obs = new ArrayList<Observer>();
	
	@Override
	public void add(Observer ob) {
		obs.add(ob);
		
	}

	@Override
	public void del(Observer ob) {
		obs.remove(ob);
		
	}
	
	@Override
	public void notifyAllObs() {
		for(Observer o : obs){
			o.doSth();
		}
	}
	
	public abstract void operation();
}
