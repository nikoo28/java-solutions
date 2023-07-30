package leetcode.easy;

public class IsSubsequence {

  boolean isSubsequence(String str1, String str2) {

    // Initialize pointers for both strings
    int i = 0;
    int j = 0;
    // We can iterate until either of them becomes zero...

    while (i < str1.length() && j < str2.length()) {
      // Compare characters, increment both pointers if same
      if (str1.charAt(i) == str2.charAt(j)) {
        i++;
        j++;
      } else {
        j++; // Only increment second pointer
      }
    }

    // If it is a subsequence, 'i' will have travelled full
    // length of string 'str1', so just check and return
    return (i == str1.length());
  }

}
