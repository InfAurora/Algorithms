public class LongestCommonPrefix {
  // Time = O(n)^2
  // Space = O(1)???
  public static void main(String[] args) {
    String[] arrayOfStringsOne = { "flower","flow","flight" };
    String[] arrayOfStringsTwo = { "dog","racecar","car" };
    System.out.println(findLongestCommonPrefix(arrayOfStringsOne));
    System.out.println(findLongestCommonPrefix(arrayOfStringsTwo));
  }

  public static String findLongestCommonPrefix(String[] strs) {
    String commonPrefix = "";
    // smallestWord will be used as the stopping point for a future for loop
    int smallestWord = 200;
    if (strs.length == 0) {
      return "";
    }
    for (String word : strs) {
      if (word.length() < smallestWord) {
       smallestWord = word.length();
      }
    }

    // outter for loop is going through one letter per word
    // use smallestWord as stopping point, so that no out of bounds errors occur
    for (int i = 0; i < smallestWord; i++) {
      commonPrefix += strs[0].charAt(i);
      // inner for loop is looping through words
      // start at 1 because index 0 letter is already added for first word
      for (int j = 1; j < strs.length; j++) {
        if (strs[j].charAt(i) != commonPrefix.charAt(i)) {
          return commonPrefix.substring(0, commonPrefix.length() - 1);
        }
      }
    }
    return commonPrefix;
  }

  // Time = O(n) (all characters in each string)
  // Space = O(1)
  //   public String findLongestCommonPrefix(String[] strs) {
  //     if (strs.length == 0) return "";
  //     String prefix = strs[0];
  //     for (int i = 1; i < strs.length; i++)
  //         while (strs[i].indexOf(prefix) != 0) {
  //             prefix = prefix.substring(0, prefix.length() - 1);
  //             if (prefix.isEmpty()) return "";
  //         }        
  //     return prefix;
  // }
}
