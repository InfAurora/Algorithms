public class SortedSquaredArrayRedo {
  // Time = O(n) Space = O(n)
  public int[] sortedSquaredArray(int[] array) {
  	int smallIndex = 0;
		int largestIndex = array.length -1;
		int[] newArray = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
    // compare left most index with right most index and then fill last available
    // index position with the bigger number and then move the appropriate pointer.
			if (Math.abs(array[smallIndex]) > Math.abs(array[largestIndex])) {
				newArray[i] = array[smallIndex] * array[smallIndex];
				smallIndex++;
			} else {
				newArray[i] = array[largestIndex] * array[largestIndex];
				largestIndex--;
			}
		}
		return newArray;
  }
}
