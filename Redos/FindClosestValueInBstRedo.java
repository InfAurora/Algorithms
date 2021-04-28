public class FindClosestValueInBstRedo {
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST insert(int value) {
      // Write your code here.
      // Do not edit the return statement of this method.
      BST newBST = new BST(value);
      BST currentNode = this;
      // continue to loop until a false or true is returned
      while(true) {
        BST parentNode = currentNode;
        if (value < currentNode.value) {
          if (currentNode.left == null) {
            currentNode.left = newBST;
            break;
          } else {
            currentNode = currentNode.left;
          }
        }  else if (value > currentNode.value) {
          if (currentNode.right == null) {
            currentNode.right = newBST;
            break;
          } else {
            currentNode = currentNode.right;
          }
        }
      }
      return this;
    }

    public boolean contains(int value) {
      // Write your code here.
      return false;
    }

    public BST remove(int value) {
      // Write your code here.
      // Do not edit the return statement of this method.
      return this;
    }
  }
}
