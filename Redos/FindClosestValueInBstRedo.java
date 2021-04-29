public class FindClosestValueInBstRedo {
// 	Average: Time = O(log(n)) | Space = O(1)
// 	Worst: Time = O(n) | Space = O(1)
  public static int findClosestValueInBst(BST tree, int target) {
		int closest = tree.value;
		while(tree != null){
			if (Math.abs(target - closest) > Math.abs(target - tree.value)) {
				closest = tree.value;
			}
			if (target < tree.value) {
				tree = tree.left;
			} else if (target > tree.value) {
				tree = tree.right;
			} else {
				break;
			}
		}
		return closest;
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
