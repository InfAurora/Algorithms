import java.util.ArrayList;
import java.util.List;

public class FindKthLargestValueInBst {
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }
  //  Time = O(n) | Space = O(n) n = to the number of nodes.
  public int findKthLargestValueInBst(BST tree, int k) {
    // Write your code here.
		List<Integer> sortedList = new ArrayList<>();
		helper(tree, sortedList);
    return sortedList.get(sortedList.size() - k);
  }

	public void helper(BST node, List<Integer> sortedList) {
		if (node == null) return;

		helper(node.left, sortedList);
		sortedList.add(node.value);
		helper(node.right, sortedList);
	}
}