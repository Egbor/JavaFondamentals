package classandobjects.balls;

public class Ball {
	private int weight;
	private Color color;
	
	public Ball(Color color, int weight) {
		this.color = color;
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public Color getColor() {
		return color;
	}
}
