package leetcode.medium;

/**
 * Created by nikoo28 on 2019-08-23 22:44
 */

public class ReverseWordsInAString {

  public String reverseWords(String s) {

    String[] words = s.split("\\s+");
    StringBuilder reversed = new StringBuilder();

    for (int i = words.length - 1; i >=0 ; i--) {
      reversed.append(new StringBuilder(words[i].trim()));
      reversed.append(" ");
    }

    return reversed.toString().trim();
  }

  public static void main(String[] args) {
    ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();

    System.out.println(reverseWordsInAString.reverseWords("  hello world!  "));
    System.out.println(reverseWordsInAString.reverseWords("a good   example"));
    System.out.println(reverseWordsInAString.reverseWords("the sky is blue"));
  }

}
