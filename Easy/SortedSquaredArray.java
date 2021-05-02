import java.util.Arrays;

public class SortedSquaredArray {
  // Time = O(nlog(n)) Space = O(n)
  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
		int[] squaredArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			squaredArray[i] = array[i] * array[i];
		}
		Arrays.sort(squaredArray);
    return squaredArray;
  }
}
