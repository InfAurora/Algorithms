import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatingCharacter {
  public static void main(String[] args) {
    String stringOne = "abcdcaf";
    String stringTwo = "aaaaccaabaa";
    String stringThree = "cabdefcabde";
    System.out.println(firstNonRepeatingCharacter(stringOne));
    System.out.println(firstNonRepeatingCharacter(stringTwo));
    System.out.println(firstNonRepeatingCharacter(stringThree));
  }

  public static int firstNonRepeatingCharacter(String string) {
    Map<Character, int[]> mapOfCharacters = new HashMap<>();
    int inOrderFound = 0;
    List<Character> nonRepeatingCharacters = new ArrayList<>();
    for (int i = 0; i < string.length(); i++) {
      int timesRepeated = 0;
      if (mapOfCharacters.containsKey(string.charAt(i))) {
        timesRepeated = mapOfCharacters.get(string.charAt(i))[1];
        mapOfCharacters.put(string.charAt(i), new int[] {inOrderFound++, timesRepeated++});
        if (nonRepeatingCharacters.contains(string.charAt(i))) {
          Character removed = string.charAt(i);
          System.out.println(removed);
          nonRepeatingCharacters.remove(removed);
        }
      } else {
        mapOfCharacters.put(string.charAt(i), new int[] {inOrderFound++, timesRepeated});
        nonRepeatingCharacters.add(string.charAt(i));
      }
    }
    if (nonRepeatingCharacters.size() != 0) {
      return mapOfCharacters.get(nonRepeatingCharacters.get(0))[0];
    }
    return -1;
  }
}
