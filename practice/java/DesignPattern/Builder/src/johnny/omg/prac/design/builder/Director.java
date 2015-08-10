package johnny.omg.prac.design.builder;

public class Director {
	
	private Builder myBuilder;
	
	public Director(Builder b){
		myBuilder = b;
	}
	
	public void construct(){
		myBuilder.buildPartA();
		myBuilder.buildPartB();
		myBuilder.buildPartC();
	}

}
