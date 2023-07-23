package leetcode.easy;

public class IsSubsequence {

  boolean isSubsequence(String s, String t) {

    // Initialize pointers for both strings
    int i = 0;
    int j = 0;
    // We can iterate until either of them becomes zero...

    while (i < s.length() && j < t.length()) {
      // Compare characters, increment both pointers if same
      if (s.charAt(i) == t.charAt(j)) {
        i++;
        j++;
      } else {
        j++; // Only increment second pointer
      }
    }

    // If it is a subsequence, 'i' will have travelled full
    // length of string 's', so just check and return
    return (i == s.length());
  }

}
