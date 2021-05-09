import java.util.ArrayList;
import java.util.List;

public class IsValidSubSequence {
  // Time = O(n)
  // Space = O(1)
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		int counter = 0;
		int indexStart = 0;
		for (int i = 0; i < sequence.size(); i++) {
			for (int j = indexStart; j < array.size(); j++) {
				if (array.get(j) == sequence.get(i)) {
					indexStart = j + 1;
					counter++;
          break;
				}
			}
		}
    return counter == sequence.size();
  }
}
