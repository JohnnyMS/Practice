package johnny.omg.prac.design.proxy;

public class Proxy {
	
	static public void run(User u){
		if(u.getClass().equals(Admin.class)){
			CreateOP.operation();
			QueryOP.operation();
		}
		if(u.getClass().equals(Client.class)){
			QueryOP.operation();
		}
	}

}
