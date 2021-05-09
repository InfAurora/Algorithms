import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
  // 	Time = O(n)
  // 	Space = O(1)
  public static void main(String[] args) {
    List<Integer> array = new ArrayList<>();
    array.add(2);
    array.add(1);
    array.add(2);
    array.add(2);
    array.add(2);
    array.add(3);
    array.add(4);
    array.add(2);
    // {2, 1, 2, 2, 2, 3, 4, 2};
    System.out.println(moveElementToEnd(array, 2));
  }
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    int count = 0;
    for (int i = 0; count < array.size(); i++) {
      System.out.println(array.indexOf(i));
      if (array.get(i) == toMove) {
        array.remove(i);
        array.add(toMove);
        i = i - 1;
      }
      count++;
    }
    return array;
  }
}
