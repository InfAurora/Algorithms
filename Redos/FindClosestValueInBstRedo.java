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
        if (value < currentNode.value) {
          if (currentNode.left == null) {
            currentNode.left = newBST;
            break;
          } else {
            currentNode = currentNode.left;
          }
        } else if (value > currentNode.value) {
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
      BST currentNode = this;
      while (currentNode != null) {
        if (value < currentNode.value) {
          currentNode = currentNode.left;
        } else if (value > currentNode.value) {
          currentNode = currentNode.right;
        } else {
          return true;
        }
      }
      return false;
    }

    public BST remove(int value) {
      remove(value, null);
			return this;
    }

    public BST remove(int value, BST parentNode) {
      // Write your code here.
      // Do not edit the return statement of this method.
      BST currentNode = this;
      while (currentNode != null) {
        if (value < currentNode.value) {
          parentNode = currentNode;
          currentNode = currentNode.left;
        } else if (value > currentNode.value) {
          parentNode = currentNode;
          currentNode = currentNode.right;
        } else {
          if (currentNode.left != null && currentNode.right != null) {
            // this finds the smallest value on the right subtree of current node, so that it can replace current nodes value
            currentNode.value = currentNode.right.getMinValue();
            // this calls the remove function on the currentNode.right value with
            // currentNode as the parent. (Removes smallest value)
            currentNode.right.remove(currentNode.value, currentNode);
          } else if (parentNode == null) {
            // this will be root node case (they do not have a parent)
            if (currentNode.left != null) {
              // manually replacing all surrounding nodes to update root node properly
              currentNode.value = currentNode.left.value;
              currentNode.right = currentNode.left.right;
              currentNode.left = currentNode.left.left;
            } else if (currentNode.right != null) {
              currentNode.value = currentNode.right.value;
              currentNode.left = currentNode.right.left;
              currentNode.right = currentNode.right.right;
            } else {
              // erase bst because there are no other nodes
              currentNode = null;
            }
          } else if (parentNode.left == currentNode) {
            // make the parentNode.left = currentNode.left if it exists otherwise
            // make it equal currentNode.right or null. Both cases are fine
            parentNode.left = currentNode.left != null ? currentNode.left : currentNode.right;
          } else if (parentNode.right == currentNode) {
            parentNode.right = currentNode.left != null ? currentNode.left : currentNode.right;
          }
          break;
        }
      }
      return this;
    }

    public int getMinValue() {
      BST currentNode = this;
      while (currentNode.left != null) {
        currentNode = currentNode.left;
      }
      return currentNode.value;
    }
  }
}
