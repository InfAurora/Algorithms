package Easy;

public class ReverseWord {
  // O(n) time
  // space???
  public static void main(String[] args) {
    String wordOne = "Hello!";
    String wordTwo = "race";
    String wordThree = "BYE";
    System.out.println(reverseString(wordOne));
    System.out.println(reverseString(wordTwo));
    System.out.println(reverseString(wordThree));
  }

  public static String reverseString(String wordToBeReversed) {
    String reversedWord = "";

    for (int i = wordToBeReversed.length() - 1; i >= 0; i--) {
      reversedWord = reversedWord + wordToBeReversed.charAt(i);
    }
    return reversedWord;
  }
}
