package util;

public class StackUsingLinkedList {

  ListNode head;

  public StackUsingLinkedList() {
    head = null;
  }

  void push(int x) {
    // Create a new node
    ListNode node = new ListNode(x);
    node.next = head;

    // Move the head
    head = node;
  }

  int pop() {
    int number = head.val;

    // Actually pop
    head = head.next;

    return number;
  }

  int peek() {
    return head.val;
  }

  boolean isEmpty() {
    return head == null;
  }

  public static void main(String[] args) {
    StackUsingLinkedList myStack = new StackUsingLinkedList();

    myStack.push(4);
    myStack.push(8);

    System.out.println(myStack.peek());

    myStack.push(15);

    myStack.pop();
    myStack.pop();

    System.out.println(myStack.pop());
  }
}
