import java.util.ArrayList;
import java.util.List;

public class BranchSums {
  
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
		int sum = 0;
		List<Integer> arrayOfSums = new ArrayList<Integer>();
    branchSumHelper(root, sum, arrayOfSums);
		return arrayOfSums;
  }
	
	public static void branchSumHelper(BinaryTree tree, int sum, List<Integer> arrayOfSums) {
    // Write your code here.
		if(tree == null) {
			return;
		}
		int newSum = sum + tree.value;
		if(tree.left == null && tree.right == null) {
			arrayOfSums.add(newSum);
			return;
		}
		branchSumHelper(tree.left, newSum, arrayOfSums);
		branchSumHelper(tree.right, newSum, arrayOfSums);
	}
}
