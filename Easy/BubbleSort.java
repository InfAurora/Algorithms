import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] array = { 8,5,2,9,5,6,3};
    System.out.println(Arrays.toString(bubbleSort(array)));
  }
// Best: Time = O(n^2) | Space = O(1)
// Average/Worst: Time = O(n^2) | Space = O(1)
  public static int[] bubbleSort(int[] array) {
    // Write your code here.
		boolean didSwap = true;
		int swapCounter = 0;
		int numberHolder = 0;
		int counter = 0;
		if (array.length == 1) {
			return array;
		}
		while (didSwap) {
			if (array[counter] > array[counter + 1]) {
				numberHolder = array[counter];
				array[counter] = array[counter + 1];
				array[counter + 1] = numberHolder;
				didSwap = true;
				swapCounter++;
				counter++;
			} else {
        counter++;
      }
			if (swapCounter == 0 && counter == array.length - 1) {
				didSwap = false;
			}

			if (counter == array.length - 1) {
				counter = 0;
				swapCounter = 0;
			}
		}
    return array;
  }
}
