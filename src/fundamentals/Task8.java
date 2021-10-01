package fundamentals;

import java.util.List;
import java.util.ArrayList;

public class Task8 {
	public static List<Integer> findInsertIndexes(int[] sequence1, int[] sequence2) {
		List<Integer> indexes = new ArrayList<Integer>();

		int indexSequence1 = 0;
		int indexSequence2 = 0;
		while ((indexSequence1 != sequence1.length) && (indexSequence2 != sequence2.length)) {
			if (sequence1[indexSequence1] > sequence2[indexSequence2]) {
				indexes.add(indexSequence1 + indexes.size()); // ƒобавл€ем следующий индекс в список учитыва€ смещение после вставки элементов 
				indexSequence2++;
			} else {
				indexSequence1++;
			}
		}
		
		if (indexes.size() < sequence2.length) {
			for (int i = indexes.size(); i < sequence2.length; i++) {
				indexes.add(sequence2.length + indexes.size()); // ƒобавл€ем следующий индекс в список учитыва€ смещение после вставки элементов
			}
		}
		
		return indexes;
	}
}
