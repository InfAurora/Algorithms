public class palindrom {
  public static void main(String[] args) {
    String wordOne = "racecar";
    String wordTwo = "helloworld";
    String wordThree = "A dog! A panic in a pagoda.";
    System.out.println(reverseWord(wordOne));
    System.out.println(reverseWord(wordTwo));
    System.out.println(reverseWord(wordThree));
  }

  public static String reverseWord(String wordToBeReversed) {
    String onlyLetters = wordToBeReversed.replaceAll("[^a-zA-Z]", "");
    for (int i = 0; i < onlyLetters.length(); i++) {
      
    }
    return null;
  }
}
