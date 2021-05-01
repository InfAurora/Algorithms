public class GetNthFib {
  // Time = O(n)
  // Space = O(1)
  public static int getNthFib(int n) {
		int[] lastTwoNumbers = {0,1};
		int counter = 3;

		while (counter <= n) {
			int nextNumber = lastTwoNumbers[0] + lastTwoNumbers[1];
			lastTwoNumbers[0] = lastTwoNumbers[1];
			lastTwoNumbers[1] = nextNumber;
			counter++;
		}
    return n > 1 ? lastTwoNumbers[1] : lastTwoNumbers[0];
  }
}
