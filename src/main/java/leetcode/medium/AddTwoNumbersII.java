package leetcode.medium;

import java.util.Stack;
import util.ListNode;

/**
 * Created by nikoo28 on 2019-08-24 02:08
 */

class AddTwoNumbersII {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    if (l1 == null) return l2;
    if (l2 == null) return l1;

    Stack<Integer> list1 = new Stack<>();
    Stack<Integer> list2 = new Stack<>();

    while (l1 != null) {
      list1.push(l1.val);
      l1 = l1.next;
    }

    while (l2 != null) {
      list2.push(l2.val);
      l2 = l2.next;
    }

    int carry = 0;
    ListNode answer = new ListNode(0);
    while (!list1.empty() && !list2.empty()) {
      int sum = list1.pop() + list2.pop() + carry;
      if (sum >= 10) {
        answer.val = sum % 10;
        carry = 1;
      } else {
        answer.val = sum;
        carry = 0;
      }
      ListNode res = answer;
      answer = new ListNode(0);
      answer.next = res;
    }

    if (list1.size() == 0 && list2.size() == 0) {
      if (carry == 1) {
        answer.val = 1;
        return answer;
      }
      return answer.next;
    }

    Stack<Integer> remainingElements = list1.size() == 0 ? list2 : list1;
    while (!remainingElements.empty()) {
      int sum = remainingElements.pop() + carry;
      if (sum >= 10) {
        answer.val = sum % 10;
        carry = 1;
      } else {
        answer.val = sum;
        carry = 0;
      }
      ListNode res = answer;
      answer = new ListNode(0);
      answer.next = res;
    }

    if (carry == 1) {
      answer.val = 1;
      return answer;
    }
    return answer.next;
  }

}
