package johnny.omg.prac.design.strategy;

public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int[] args = split(exp, "\\+");
		int result = 0;
		for(int i : args){
			result += i;
		}
		return result;
	}

}
