package johnny.omg.prac.design.command;

public class Invoker {
	
	Command c = null;
	
	public void setCommmand(Command c){
		this.c = c;
	}
	
	public void executeOrder(){
		this.c.exec();
	}

}
