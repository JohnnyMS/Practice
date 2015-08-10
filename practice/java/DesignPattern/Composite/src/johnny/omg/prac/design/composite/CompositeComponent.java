package johnny.omg.prac.design.composite;

import java.util.ArrayList;

public class CompositeComponent extends Component {

	private ArrayList<Component> comps = new ArrayList<Component>();
	
	@Override
	public void operation() {
		for(Component c : comps){
			c.operation();
		}
	}
	
	public void add(Component c){
		comps.add(c);
	}
	
	public Component get(int i){
		return comps.get(i);
	}

}
