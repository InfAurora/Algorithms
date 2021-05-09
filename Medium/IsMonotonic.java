public class IsMonotonic {

  public static void main(String[] args) {
    int[] array = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
    System.out.println(isMonotonic(array));
  }
  // Time = O(n)
  // Space = O(1)
  public static boolean isMonotonic(int[] array) {
    // Write your code here.
		if (array.length <= 2) {
			return true;
		}

		if (array[0] < array[array.length - 1]) {
			return nonDecreasing(array);
		} else if (array[0] > array[array.length - 1]){
			return nonIncreasing(array);
		} else {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] != array[i+1]) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean nonDecreasing(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i+1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean nonIncreasing(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i+1]) {
				return false;
			}
		}
		return true;
	}
}
