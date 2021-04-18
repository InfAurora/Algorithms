public class ReverseSentence {
  // Only has to go through half of the words to complete
  // time = O(n) / 2
  // space = O(n)
  public static void main(String[] args) {
    String sentenceOne = "The whole world would like to say hello!";
    String sentenceTwo = "Roses are red, violets are blue, this is a sentence.";
    String sentenceThree = "Hi, my name is Jeff!";
    System.out.println(reversedStringMethod(sentenceOne));
    System.out.println(reversedStringMethod(sentenceTwo));
    System.out.println(reversedStringMethod(sentenceThree));
  }

  public static String reversedStringMethod(String sentenceToBeReversed) {
    String[] arrayOfWords = sentenceToBeReversed.split(" ");
    String reversedString = "";
    String wordHolder = "";
    for (int i = 0; i < arrayOfWords.length / 2; i++) {
      wordHolder = arrayOfWords[i];
      arrayOfWords[i] = arrayOfWords[arrayOfWords.length - i - 1];
      arrayOfWords[arrayOfWords.length - i - 1] = wordHolder;
    }

    // leaves a trailing space at the end of the sentence
    // can resolve by using a normal for loop and using an if 
    // statement to check if you are at the end of the array
    for (String word : arrayOfWords) {
      reversedString += word + " ";
    }
    return reversedString;
  }
}
