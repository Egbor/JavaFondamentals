package fundamentals;

public class Task6 {
	public static int[][] buildMatrix(int[] array) {
		int[][] matrix = new int[array.length][array.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = array[(j + i) % array.length];
			}
		}
		return matrix;
	}
}
