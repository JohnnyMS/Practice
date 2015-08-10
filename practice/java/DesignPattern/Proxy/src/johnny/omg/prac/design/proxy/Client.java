package johnny.omg.prac.design.proxy;

public class Client implements User {

	@Override
	public void run() {
		Proxy.run(this);

	}

}
