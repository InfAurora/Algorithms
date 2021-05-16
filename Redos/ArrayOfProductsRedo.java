public class ArrayOfProductsRedo {
  // Time = O(n) Space = O(n)
  public int[] arrayOfProducts(int[] array) {
		int[] products = new int[array.length];

		int leftRunningProduct = 1;
		for(int i = 0; i < array.length; i++) {
			products[i] = leftRunningProduct;
			leftRunningProduct *= array[i];
		}

		int rightRunningProduct = 1;
		for (int j = array.length - 1; j >= 0; j--) {
			products[j] *= rightRunningProduct;
			rightRunningProduct *= array[j];
		}
    return products;
  }
}
