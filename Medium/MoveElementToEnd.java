import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
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
    // Write your code here.
    // Need to shift keep pointer on same index position as number just removed
    // Use seperate counter as stopping point
    for (int i = 0; i < array.size(); i++) {
      System.out.println(array.indexOf(i));
      if (array.get(i) == toMove) {
        array.remove(i);
        array.add(toMove);
      }
    }
    return array;
  }
}
