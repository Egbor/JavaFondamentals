package fundamentals;

public class Task1 {
	public static double evaluateExpression(double x, double y) {
		double numerator = 1 + Math.sin(x + y) * Math.sin(x + y);
		double denominator = 2 + Math.abs(x - (2 * x / (1 + x * x * y * y)));
		return (numerator / denominator) + x;
	}
}
