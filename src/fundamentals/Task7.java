package fundamentals;

public class Task7 {
	public static int[] shellSort(int[] array) {
		for (int step = array.length / 2; step > 0; step /= 2) {
			for (int i = step; i < array.length; i++) {
				int j = 0;
				int temp = array[i];
				for (j = i; j >= step; j -= step) {
					if (temp < array[j - step]) {
						array[j] = array[j - step];
					} else {
						break;
					}
				}
				array[j] = temp;
			}
		}
		return array;
	}
}
