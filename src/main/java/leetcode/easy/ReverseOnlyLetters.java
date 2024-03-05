package leetcode.easy;

public class ReverseOnlyLetters {

  String reverseOnlyLetters(String s) {

    // Convert the string to a character array
    char[] arr = s.toCharArray();

    // Get the left and right pointers
    int left = 0;
    int right = arr.length - 1;

    // Start a loop and compare characters
    while (left < right) {

      // If left is not a letter, move right
      if (!Character.isLetter(arr[left])) left++;

      // If right is not a letter, move left
      else if (!Character.isLetter(arr[right])) right--;

      // If both are letters, swap them
      else {
        char temp = arr[left];
        arr[left++] = arr[right];
        arr[right--] = temp;
      }
    }

    // Convert the character array to a string
    return new String(arr);
  }

}
