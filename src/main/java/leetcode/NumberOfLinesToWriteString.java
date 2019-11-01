package leetcode;

/**
 * Created by nikoo28 on 9/22/18 6:43 PM
 */

class NumberOfLinesToWriteString {

  private int[] numberOfLines(int[] widths, String S) {

    int lines = 1;
    int lineWidth = 0;
    int maxWidth = 100;

    int remainingLength = 0;
    for (int i = 0; i < S.length(); i++) {

      int charWidth = widths[S.charAt(i) - 'a'];

      if (lineWidth + charWidth <= maxWidth) {
        lineWidth += charWidth;
        remainingLength = lineWidth;
        continue;
      }

      lines++;
      lineWidth = 0;
      remainingLength = charWidth;
      lineWidth += charWidth;
    }

    int[] result = new int[2];
    result[0] = lines;
    result[1] = remainingLength;

    return result;
  }

  public static void main(String[] args) {
    NumberOfLinesToWriteString numberOfLinesToWriteString = new NumberOfLinesToWriteString();
    int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
    String s = "bbbcccdddaaa";

    for (int a : numberOfLinesToWriteString.numberOfLines(widths, s)) {
      System.out.println(a);
    }
  }
}
