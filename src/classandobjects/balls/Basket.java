package classandobjects.balls;

import java.util.List;
import java.util.ArrayList;

public class Basket {
	private List<Ball> balls = new ArrayList<Ball>();
	
	public void addBall(Ball ball) {
		balls.add(ball);
	}
	
	public int getTotalWeight() {
		int totalWeight = 0;
		for (Ball ball : balls) {
			totalWeight += ball.getWeight();
		}
		return totalWeight;
	}
	
	public int getBallCountBy(Color color) {
		int ballCount = 0;
		for (Ball ball : balls) {
			if (color == ball.getColor()) {
				ballCount++;
			}
		}
		return ballCount;
	}
}
