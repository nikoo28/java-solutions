package leetcode;

/**
 * @author nikoo28 on 9/15/17
 */
class AlmostPalindromes {

  public static int almost_palindromes(String str) {

    StringBuilder sb = new StringBuilder(str);
    String reversed = sb.reverse().toString();

    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != reversed.charAt(i))
        count++;
    }

    return count;

  }

}
