package fundamentals;

public class Task3Result {
	private double argValue;
	private double resultValue;
	
	public Task3Result(double arg, double result) {
		argValue = arg;
		resultValue = result;
	}
	
	public String toString() {
		return String.valueOf(argValue) + " " + String.valueOf(resultValue);
	}
}
