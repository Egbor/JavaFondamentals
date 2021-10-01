package fundamentals;

import java.util.List;
import java.util.ArrayList;

public class Task3 {
	public static List<Task3Result> findRangeOfValue(double edgePoint1, double edgePoint2, double step) {
		List<Task3Result> resultTable = new ArrayList<Task3Result>();
		
		for (double arg = edgePoint1; arg < edgePoint2; arg += step) {
			resultTable.add(new Task3Result(arg, Math.tan(arg)));
		}
		return resultTable;
	}
}
