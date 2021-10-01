package fundamentals;

import java.util.List;
import java.util.ArrayList;

public class Task4 {
	private static boolean isPrime(int value) {
		for (int i = 2; i < Math.sqrt(value); i++) {
			if ((value % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static List<Integer> findIndexesOfPrimes(int[] array) {
		List<Integer> resultTable = new ArrayList<Integer>();
		
		for (int i = 0; i < array.length; i++) {
			if (isPrime(array[i])) {
				resultTable.add(i);
			}
		}
		return resultTable;
	}
}
