import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  // Time = log O(n) - O(n)
  // Space = log O(n) - O(n)
  public static void main(String[] args) {
    int[] numbersOne = {3, 5, -4, 8, 11, 1, -1, 6};
    int[] numbersTwo = {4, 6};
    int[] numbersThree = {4,6,1};
    int[] numbersFour = {4, 6, 1, -3};
    System.out.println(Arrays.toString(twoNumberSum(numbersOne, 10)));
    System.out.println(Arrays.toString(twoNumberSum(numbersTwo, 10)));
    System.out.println(Arrays.toString(twoNumberSum(numbersThree, 5)));
    System.out.println(Arrays.toString(twoNumberSum(numbersFour, 3)));
  }

  public static int[] twoNumberSum(int[] array, int targetSum) {
    Map<Integer, Integer> nums = new HashMap<>();
    for(int i = 0; i < array.length; i++) {
      int compliment = targetSum - array[i];
      if(nums.containsKey(compliment)) {
        return new int[] {compliment, array[i]};
      } else {
        nums.put(array[i], compliment);
      }
    }
    return new int[0];
  }
}
