package leetcode.easy;

public class ReverseWordsInAStringIII {

  String reverseWords(String s) {

    char[] arr = s.toCharArray();

    int left = 0, right = 0;

    while (right < arr.length) {
      // If we find a space, reverse the word
      if (arr[right] == ' ') {
        reverse(arr, left, right - 1);
        left = right + 1;
      }

      right++;
    }

    // Reverse the last word
    reverse(arr, left, right - 1);

    // Return the string
    return new String(arr);
  }

  private void reverse(char[] arr, int left, int right) {
    while (left < right) {
      char temp = arr[left];
      arr[left++] = arr[right];
      arr[right--] = temp;
    }
  }

}
