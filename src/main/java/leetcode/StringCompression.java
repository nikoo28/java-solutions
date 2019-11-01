package leetcode;

/**
 * @author nikoo28 on 12/1/17
 */
class StringCompression {

  private static int compress(char[] chars) {

    if (chars.length == 1)
      return 1;

    char prevChar = chars[0];
    int currentCharCount = 1;

    int result = 0;

    for (int i = 1; i < chars.length; i++) {

      char newChar = chars[i];
      if (newChar == prevChar) {
        currentCharCount++;
        continue;
      }

      if (currentCharCount > 1) {
        result += 1 + (int) (Math.log10(currentCharCount) + 1);
      } else
        result += 1;

      prevChar = newChar;
      currentCharCount = 1;
    }

    if (currentCharCount > 1) {
      result += 1 + (int) (Math.log10(currentCharCount) + 1);
    } else
      result += 1;

    return result;
  }

  public static void main(String[] args) {
    char[] chars = {'a'};
    System.out.println(compress(chars));
  }

}
