package johnny.omg.prac.design.proxy;

public class Admin implements User {
	
	@Override
	public void run(){
		Proxy.run(this);
	}

}
