package fundamentals;

public class Task2 {
	public static boolean checkPointBelonging(float x, float y) {
		boolean isTopArea = !((x < -4.0f) || (y > 5.0f) || (x > 4.0f) || (y < 0.0f));
		boolean isBottomArea = !((x < -6.0f) || (y > 0.0f) || (x > 6.0f) || (y < -3.0f));
		return isTopArea || isBottomArea;
	}
}
