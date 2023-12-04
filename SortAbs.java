public class SortAbs {
  static Node head; 

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  Node sortedList(Node head) {
    Node prev = head;
    Node curr = head.next;

    while (curr != null) {
      if (curr.data < prev.data) {
        prev.next = curr.next;
        curr.next = head;
        head = curr;
        curr = prev;
      }
      else prev = curr;
      curr = curr.next;
    }
    return head;
  }

  public void push(int new_data) {
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }

  void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data +" ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    SortAbs list = new SortAbs();
    list.push(-5);
    list.push(5);
    list.push(4);
    list.push(3);
    list.push(-2);
    list.push(1);
    list.push(0);

    System.out.println("Original List: ");
    list.printList(head);

    head = list.sortedList(head);
    System.out.println("Sorted List: ");
    list.printList(head);
  }
}
