import java.util.ArrayList;

public class ReconstructBst {
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }

  public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
    // Write your code here.
    // If smaller go left. moment gets bigger then current node then return
    // then go right. Do that recursively/ or until while loop is finished
    return null;
  }
}
