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
    
  }
}
// n = 3
// 0, Ahmed
// 1, Mona
// 2, Khaled
// 3, Micky~Mimi~Toto (temp.next -> temp)
// 4, medhat (temp.next.next -> temp.next)

