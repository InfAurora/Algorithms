public class RemoveDuplicatesFromLinkedList {
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }
  // Time = O(n)
	// Space = O(1)
  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
		LinkedList currentNode = linkedList;
    while (currentNode != null) {
			LinkedList nextNode = currentNode.next;
			while (nextNode != null && currentNode.value == nextNode.value) {
				nextNode = nextNode.next;
			}
			currentNode.next = nextNode;
			currentNode = nextNode;
		}
    return linkedList;
  }
}
