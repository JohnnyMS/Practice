package johnny.omg.prac.design.command;

public class MyCommand implements Command {
	
	Receiver r = null;
	
	public MyCommand(Receiver r){
		this.r = r;
	}

	@Override
	public void exec() {
		this.r.doAction();

	}

}
