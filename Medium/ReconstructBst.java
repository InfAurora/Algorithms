import java.util.ArrayList;
import java.util.List;

public class ReconstructBst {
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }
// Time = O(n^2) | Space = O(n)
  public BST reconstructBst(List<Integer> preOrderTraversalValues) {
    // Write your code here.
		if (preOrderTraversalValues.size() == 0) {
			return null;
		}

		int currentValue = preOrderTraversalValues.get(0);
		int rightSubTreeRootIdx = preOrderTraversalValues.size();

		for(int idx = 1; idx < preOrderTraversalValues.size(); idx++) {
			int value = preOrderTraversalValues.get(idx);
			if(value >= currentValue) {
				rightSubTreeRootIdx = idx;
				break;
			}
		}

		BST leftSubTree = reconstructBst(preOrderTraversalValues.subList(1, rightSubTreeRootIdx));
		BST rightSubTree =
			reconstructBst(preOrderTraversalValues.subList(rightSubTreeRootIdx, preOrderTraversalValues.size()));
		BST bst = new BST(currentValue);
		bst.left = leftSubTree;
		bst.right = rightSubTree;
    return bst;
  }
}
