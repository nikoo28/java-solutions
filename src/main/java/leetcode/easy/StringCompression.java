package leetcode.easy;

/**
 * Created by nikoo28 on 2019-09-14 17:34
 */

class StringCompression {

  public int compress(char[] chars) {
    int anchor = 0, write = 0;
    for (int read = 0; read < chars.length; read++) {
      if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
        chars[write++] = chars[anchor];
        if (read > anchor) {
          for (char c : ("" + (read - anchor + 1)).toCharArray()) {
            chars[write++] = c;
          }
        }
        anchor = read + 1;
      }
    }
    return write;
  }

}
