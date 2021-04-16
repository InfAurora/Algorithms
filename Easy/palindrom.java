package Easy;

public class Palindrom {
  public static void main(String[] args) {
    String wordOne = "racecar";
    String wordTwo = "helloworld";
    String wordThree = "A dog! A panic in a pagoda.";
    System.out.println(reverseWord(wordOne));
    System.out.println(reverseWord(wordTwo));
    System.out.println(reverseWord(wordThree));
  }

  // This method will check and see if any word is a palindrome,
  // but will ignore anything that is not a letter, and it does not care
  // about casing
  public static boolean reverseWord(String wordToBeReversed) {
    String onlyLetters = wordToBeReversed.replaceAll("[^a-zA-Z]", "").toLowerCase();
    String secondHalf = "";
    String reversedFirstHalf = "";
    if (onlyLetters.length() == 0) {
      return true;
    }
    if (onlyLetters.length() % 2 == 0) {
      secondHalf = onlyLetters.substring(onlyLetters.length()/2); 
    } else {
      secondHalf = onlyLetters.substring(onlyLetters.length()/2 + 1);
    }
    for (int i = secondHalf.length() - 1; i >= 0; i--) {
      reversedFirstHalf += onlyLetters.charAt(i);
    }
      System.out.println(reversedFirstHalf);
      System.out.println(secondHalf);
    if (reversedFirstHalf.equals(secondHalf)) {
      return true;
    }
    return false;
  }
}
