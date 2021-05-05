public class InvertBinaryTree {
//  Time = O(n) | Space = O(d) d = depth.
  public static void invertBinaryTree(BinaryTree tree) {
    // Write your code here.
		help(tree);
  }

	public static BinaryTree help(BinaryTree tree) {
    // Write your code here.
		if (tree == null) return null;
		BinaryTree left  = help(tree.left);
		BinaryTree right = help(tree.right);
		tree.left = right;
		tree.right = left;
		return tree;
  }

  static class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
    }
  }
}
