public class FirstDuplicateValue {
  // TIME = O(n) | SPACE O(1)
  public int firstDuplicateValue(int[] array) {
    for(int value: array) {
      int index = Math.abs(value);
      if(array[index - 1] < 0) return index;
      array[index - 1] *= -1;
    }
    return -1;
  }
}
