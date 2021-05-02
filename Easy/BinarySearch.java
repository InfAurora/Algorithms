public class BinarySearch {
  // Time = O(log(n)) Space = O(1)
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
    return helper(array, target, 0, array.length - 1);
  }

	public static int helper(int[] array, int target, int left, int right) {
		while (left <= right) {
			int middleIndex = (left + right) / 2;

			if (array[middleIndex] == target) {
				return middleIndex;
			} else if (array[middleIndex] > target) {
				right = middleIndex - 1;
			} else {
				left = middleIndex + 1;
			}
		}
		return -1;
	}
}
