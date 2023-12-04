public class MTN {
  class Node {
    public int data;
    public Node next;
  }

  public class LinkedList {
    private Node head;
  }

  public int multiplyLists(LinkedList l1, LinkedList l2) {
    if (l1.head == null || l2.head == null) return 0; // empty list case
    Node curr1 = l1.head;
    Node curr2 = l2.head;
    int num1 = 0;
    int num2 = 0;

    while (curr1 != null) {
      num1 += curr1.data;
      num1*=10;
      curr1 = curr1.next;
    }

    while (curr2 != null) {
      num2 += curr2.data;
      num2*=10;
      curr2 = curr2.next;
    }

    return num1 * num2;
  }

  // A utility function to print a linked list 
  static void printList(Node node) { 
    while(node != null) { 
      System.out.print(node.data); 
      if(node.next != null) 
        System.out.print("->"); 
      node = node.next; 
    } 
    System.out.println(); 
  }

  public static void main(String[] args) {
    MTN mtn = new MTN();
    MTN.LinkedList l1 = mtn.new LinkedList();
    MTN.LinkedList l2 = mtn.new LinkedList();

    // add nodes to the first list
    l1.head = mtn.new Node();
    l1.head.data = 1;
    Node second1 = mtn.new Node();
    second1.data = 2;
    l1.head.next = second1;
    Node third1 = mtn.new Node();
    third1.data = 3;
    second1.next = third1;

    // add nodes to the second list
    l2.head = mtn.new Node();
    l2.head.data = 4;
    Node second2 = mtn.new Node();
    second2.data = 5;
    l2.head.next = second2;
    Node third2 = mtn.new Node();
    third2.data = 6;
    second2.next = third2;

    System.out.println("First list: ");
    MTN.printList(l1.head);
    System.out.println("Second list: ");
    MTN.printList(l2.head);
    System.out.println("Product of the two lists: " + mtn.multiplyLists(l1, l2));
  }
}
