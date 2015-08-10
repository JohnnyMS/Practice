package johnny.omg.prac.design.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

	private HashMap<Object, Flyweight> flies = new HashMap<Object, Flyweight>();
	public Flyweight getFlyweight(Object key){
		Flyweight v = flies.get(key);
		if(v == null){
			Flyweight f = new ConcreteFlyweight();
			flies.put(key, f);
			System.out.println("generating new flyweight");
			return f;
		}
		else{
			System.out.println("returing old flyweight");
			return v;
		}
	}
}
