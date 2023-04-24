package leetcode.easy;

public class LengthOfLastWord {

  int lengthOfLastWord(String s) {

    int count = 0;

    for (int i = s.length() - 1; i >= 0; i--) {

      // a letter is found so count
      if (s.charAt(i) != ' ') {
        count++;
      }
      else {
        // it's a white space instead
        // Did we already started to count a word ?
        // Yes so we found the last word
        if (count > 0)
          return count;
      }
    }

    return count;
  }

}
