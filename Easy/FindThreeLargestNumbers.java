import java.util.Arrays;

public class FindThreeLargestNumbers {

  public static void main(String[] args) {
    int[] array = { 141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7 };
    System.out.println(Arrays.toString(findThreeLargestNumbers(array)));
  }
  // Time = O(n)
	// Space = O(1)
  public static int[] findThreeLargestNumbers(int[] array) {
    // Write your code here.
		int[] biggestNumbers = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		for (int number: array) {
			if (number > biggestNumbers[2]) {
				shiftBiggest(biggestNumbers, number);
			} else if (number > biggestNumbers[1]) {
				shiftMiddle(biggestNumbers, number);
			} else if (number > biggestNumbers[0]) {
				biggestNumbers[0] = number;
			}
		}
    return biggestNumbers;
  }

	public static void shiftBiggest(int[] array, int biggest) {
		int newMiddle = array[2];
		int newSmallest = array[1];
		array[2] = biggest;
		array[1] = newMiddle;
		array[0] = newSmallest;
	}

	public static void shiftMiddle(int[] array, int middle) {
		int newSmallest = array[1];
		array[1] = middle;
		array[0] = newSmallest;
	}
}
