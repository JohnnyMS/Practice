package johnny.omg.prac.design.strategy;

public abstract class AbstractCalculator {
	
	public int[] split(String exp, String opt){
		String[] arr = exp.split(opt);
		int[] result = new int[arr.length];
		for(int i = 0; i < arr.length; ++i){
			result[i] = Integer.parseInt(arr[i]);
		}
		
		return result;
	}

}
