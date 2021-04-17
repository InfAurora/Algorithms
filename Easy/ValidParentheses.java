import java.util.Stack;

public class ValidParentheses {
  // Time = 
  // Space = 
  public static void main(String[] args) {
    String validStringOne = "()";
    String validStringTwo = "({()})";
    String validStringThree = "(){()()[]}[]";
    String invalidStringOne = "([)])";
    String invalidStringTwo = "(";
    String invalidStringThree = "[[[[[())]]]]]";
    System.out.println(isValid(validStringOne));
    System.out.println(isValid(validStringTwo));
    System.out.println(isValid(validStringThree));
    System.out.println(isValid(invalidStringOne));
    System.out.println(isValid(invalidStringTwo));
    System.out.println(isValid(invalidStringThree));
  }

  public static boolean isValid(String stringOfBrackets) {
    Stack<Character> stackOfBrackets = new Stack<>();
    for (int i = 0; i < stringOfBrackets.length(); i++) {
      if (stringOfBrackets.length() == 1) {
        return false;
      }
      
      switch (stringOfBrackets.charAt(i)) {
        case ')':
          if (stackOfBrackets.size() == 0) {
            return false;
          } else if (stackOfBrackets.peek() == '(') {
            stackOfBrackets.pop();
          }
          else return false;
          break;
        case ']':
          if (stackOfBrackets.size() == 0) {
            return false;
          } else if (stackOfBrackets.peek() == '[') {
            stackOfBrackets.pop();
          }
          else return false;
          break;
        case '}':
          if (stackOfBrackets.size() == 0) {
            return false;
          } else if (stackOfBrackets.peek() == '{') {
            stackOfBrackets.pop();
          }
          else return false;
          break;
      
        default:
          stackOfBrackets.push(stringOfBrackets.charAt(i));
          break;
      }
    }
    if (stackOfBrackets.size() != 0) {
      return false;
    }
    return true;
  }
}
