package Easy;

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
      if(stringOfBrackets.charAt(i) == ')') {
        if (stackOfBrackets.peek() == '(') {
          stackOfBrackets.pop();
        }
        else return false;
      } else if (stringOfBrackets.charAt(i) == ']') {
        if (stackOfBrackets.peek() == '[') {
          stackOfBrackets.pop();
        }
        else return false;
      } else if (stringOfBrackets.charAt(i) == '}') {
        if (stackOfBrackets.peek() == '{') {
          stackOfBrackets.pop();
        }
        else return false;
      } else {
        stackOfBrackets.push(stringOfBrackets.charAt(i));
      }
    }
    return true;
  }
}
