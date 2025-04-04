package leetcode.easy;

public class RansomNote {

  boolean canConstruct(String ransomNote, String magazine) {
    int[] charCount = new int[26];

    // Count the frequency of each character in the magazine
    for (char c : magazine.toCharArray()) {
      charCount[c - 'a']++;
    }

    // Check if we can construct the ransom note
    for (char c : ransomNote.toCharArray()) {
      if (charCount[c - 'a'] == 0) {
        return false; // Character not available in magazine
      }
      charCount[c - 'a']--;
    }

    // Ransom note can be constructed
    return true;
  }

}
