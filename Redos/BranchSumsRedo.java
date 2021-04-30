import java.util.ArrayList;
import java.util.List;

public class BranchSumsRedo {
  // Time = O(n) Space = O(n) n is the number of nodes in the Binary Tree
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    // Write your code here.
		ArrayList<Integer> branchSums = new ArrayList<Integer>();
		branchSums(root, 0, branchSums);
    return branchSums;
  }

	public static void branchSums(BinaryTree root, int sum, ArrayList<Integer> branchSums) {
    if (root == null) return;

		int newSum = sum + root.value;
		if (root.left == null && root.right == null) {
			branchSums.add(newSum);
			return;
		}
		branchSums(root.left, newSum, branchSums);
		branchSums(root.right, newSum, branchSums);
  }
}
