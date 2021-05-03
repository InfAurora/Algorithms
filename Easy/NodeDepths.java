public class NodeDepths {

  // Average case: when the tree is balanced
  // O(n) time | O(h) space - where n is the number of nodes in
  // the Binary Tree and h is the height of the Binary Tree
  public static int nodeDepths(BinaryTree root) {
		int depthsAdded = 0;
    return nodeDepths(root, depthsAdded);
  }

	public static int nodeDepths(BinaryTree root, int depthsAdded) {
    if (root == null) return 0;
		return depthsAdded + nodeDepths(root.left, depthsAdded + 1) + nodeDepths(root.right, depthsAdded + 1);
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
