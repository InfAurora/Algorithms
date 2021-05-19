import java.util.Arrays;
// TIME = O(nlog(n)) | SPACE O(1)
public class TandemBycicle {
  public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
    Arrays.sort(redShirtSpeeds);
		Arrays.sort(blueShirtSpeeds);
		int totalSpeed = 0;
		if(!fastest) {
			reverseArray(blueShirtSpeeds);
		}
		for(int i = 0; i < redShirtSpeeds.length; i++) {
				int redRider = redShirtSpeeds[i];
				int blueRider = blueShirtSpeeds[blueShirtSpeeds.length - i - 1];
				totalSpeed += Math.max(redRider, blueRider);
		}
    return totalSpeed;
  }

	public void reverseArray(int[] array) {
		int start = 0;
		int end = array.length - 1;
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
}
