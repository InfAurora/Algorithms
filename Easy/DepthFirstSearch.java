import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
  // time = O(v + e)
  // space = O(v)
  // Where v stands for vertices (nodes), vertices are points in a graph
  //  e stands for edges, the lines that connect each vertice/node
  public static void main(String[] args) {
    
  }

  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
      // Write your code here.
			array.add(this.name);
			for(Node child: children) {
				child.depthFirstSearch(array);
			}
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
