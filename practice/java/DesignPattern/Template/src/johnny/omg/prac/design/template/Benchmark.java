package johnny.omg.prac.design.template;

public abstract class Benchmark {
	
	protected abstract void run();
	
	public final void benchmark(){
		System.out.println("runing begins");
		run();
		System.out.println("runing ends");
	}

}
