import java.util.Arrays;

public class NonConstructibleChange {
  // Time = O(nlogn), because of the sorting that is done first
  // Space = O(1).
  public int nonConstructibleChange(int[] coins) {
    // Write your code here.
		Arrays.sort(coins);
		int currentCreatedChange = 0;
		for (Integer coin : coins) {
			if (coin > currentCreatedChange + 1) {
				return currentCreatedChange + 1;
			}
			currentCreatedChange += coin;
		}
    return currentCreatedChange + 1;
  }
}
