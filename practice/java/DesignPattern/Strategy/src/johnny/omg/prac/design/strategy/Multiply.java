package johnny.omg.prac.design.strategy;

public class Multiply extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int[] args = split(exp, "\\*");
		int result = 1;
		for(int i : args){
			result *= i;
		}
		return result;
	}

}
