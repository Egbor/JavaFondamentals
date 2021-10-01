package fundamentals;

import java.util.List;
import java.util.ArrayList;

public class Task5 {
	public static int findMaxPairLength(List<Task5Pair> pairs) {
		if (pairs.size() == 0) {
			return 0;
		}
		
		Task5Pair lengthestPair = pairs.get(0);
		for (Task5Pair pair : pairs) {
			if (pair.sequenceLength > lengthestPair.sequenceLength) {
				lengthestPair = pair;
			}
		}
		return lengthestPair.sequenceLength;
	}
	
	public static void putElementTo(List<Task5Pair> pairs, int element) {
		Task5Pair insertingPair = null;
		for (Task5Pair pair : pairs) {
			if (pair.maxSequenceElement < element) {
				if ((insertingPair == null) || (pair.sequenceLength > insertingPair.sequenceLength)) {
					insertingPair = pair;
				}
			}
		}
		
		if (insertingPair == null) {
			pairs.add(new Task5Pair(element));
		} else {
			insertingPair.maxSequenceElement = element;
			insertingPair.sequenceLength++;
		}
	}
	
	public static int findMinExcludeSequenceCount(int[] array) {
		List<Task5Pair> pairs = new ArrayList<Task5Pair>();
		for (int i = 0; i < array.length; i++) {
			putElementTo(pairs, array[i]);
		}
		return array.length - findMaxPairLength(pairs);
	}
}
