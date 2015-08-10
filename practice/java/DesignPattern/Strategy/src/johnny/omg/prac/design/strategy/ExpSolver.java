package johnny.omg.prac.design.strategy;

public class ExpSolver {
	
	ICalculator myCal = null;
	
	public ExpSolver(ICalculator cal){
		myCal = cal;
	}
	
	public int solve(String exp){
		return myCal.calculate(exp);
	}
	
	public void changeCalculator(ICalculator cal){
		myCal = cal;
	}

}
