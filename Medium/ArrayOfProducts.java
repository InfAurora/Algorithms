public class ArrayOfProducts {
  // Time = O(n^2)
  // Space = O(n).
  public int[] arrayOfProducts(int[] array) {
    // Write your code here.
		int[] arrayOfProducts = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			int product = 1;
			for (int j = 0; j < array.length; j++) {
				if (j != i) {
					product *= array[j];
				}
			}
			arrayOfProducts[i] = product;
		}
    return arrayOfProducts;
  }
}
