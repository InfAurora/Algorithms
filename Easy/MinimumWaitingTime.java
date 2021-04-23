
public class MinimumWaitingTime {
  public static void main(String[] args) {
    int[] arrayOne = {3,2,1,2,6};
    System.out.println(sort(arrayOne));
  }

  public static int sort(int[] queries) {
    int holder = 0;
    for (int i = 0; i < queries.length; i++) {
      for (int j = 0; j < queries.length; j++) {
        if (queries[i] < queries[j]) {
          holder = queries[i];
          queries[i] = queries[j];
          queries[j] = holder;
        }
      }
    }
    return minimumTime(queries);
  }

  public static int minimumTime(int[] queries) {
    int time = 0;
    int[] timePartsAdded = new int[queries.length - 1];
    if (queries.length == 2) {
      return queries[0];
    }
    for (int i = 2; i <= queries.length - 1; i++) {
      if (i == 2) {
        timePartsAdded[0] = queries[0];
        timePartsAdded[1] = queries[0] + queries[1];
      } else {
        timePartsAdded[i -1] += timePartsAdded[i - 2] + queries[i - 1];
      }
    }
    for (int timePart : timePartsAdded) {
      time += timePart;
    }
    return time;
  }
}