public class FindClosestValueInBst {

  // Average TIME = O(log(n)) | SPACE O(log(n))
  // Worst TIME =  O(n) | SPACE O(n)
  public static void main(String[] args) {

  }

  public static int findClosestValueInBst(BST tree, int target) {
    return findClosestValueInBstHelper(tree, target, tree.value);
  }

	public static int findClosestValueInBstHelper(BST tree, int target, int closest) {
		int currentNodeValue = tree.value;
   	if (Math.abs(target - closest) > Math.abs(target - currentNodeValue)) {
			closest = tree.value;
		}
		if (target < currentNodeValue && tree.left != null) {
			return findClosestValueInBstHelper(tree.left, target, closest);
		} else if (target > currentNodeValue && tree.right != null) {
			return findClosestValueInBstHelper(tree.right, target, closest);
		} else {
			return closest;
		}
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
