package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
  // Time???
  // Space???
  public static void main(String[] args) {
    int[] numbersOne = {1, 2, -1, -3, 3, -4, 5};
    int[] numbersTwo = {1, 2, 5};
    int[] numbersThree = {-1, -3, -4, -5};
    System.out.println(Arrays.toString(findTargetSum(numbersOne, -7)));
    System.out.println(Arrays.toString(findTargetSum(numbersTwo, 7)));
    System.out.println(Arrays.toString(findTargetSum(numbersThree, -9)));
  }

  public static int[] findTargetSum(int[] arrayOfIntegers, int target) {
    int[] indicies = new int[2];
    HashMap<Integer, Integer> numberNeeded = new HashMap<>();
    for (int i = 0; i <= arrayOfIntegers.length - 1; i++) {
      if (numberNeeded.containsKey(target - arrayOfIntegers[i])) {
        indicies[0] = numberNeeded.get(target - arrayOfIntegers[i]);
        indicies[1] = i;
        return indicies;
      }
      numberNeeded.put(arrayOfIntegers[i], i);
      numberNeeded.put(target - arrayOfIntegers[i], i);
    }
    return indicies;
  }
}
