package leetcode.medium;

public class LongestRepeatingCharacterReplacement {

  int characterReplacement(String s, int k) {

    int[] freq = new int[26];
    int left = 0;
    int maxFreq = 0;
    int maxWindow = 0;

    for (int right = 0; right < s.length(); right++) {

      // Update the frequency of the current character
      freq[s.charAt(right) - 'A']++;

      // Update the max frequency
      maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

      int windowLength = right - left + 1;

      // If the windowLength - max frequency > k,
      // then we need to shrink the window
      if (windowLength - maxFreq > k) {
        freq[s.charAt(left) - 'A']--;
        left++;
      }

      windowLength = right - left + 1;
      maxWindow = Math.max(maxWindow, windowLength);
    }

    return maxWindow;

  }

}
