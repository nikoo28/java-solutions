package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

  private final DecodeString decodeString;

  DecodeStringTest() {
    decodeString = new DecodeString();
  }

  @Test
  void testDecodeString1() {
    String s= "3[a]2[bc]";
    String expected = "aaabcbc";

    assertEquals(expected, decodeString.decodeString(s));
  }

  @Test
  void testDecodeString2() {
    String s= "3[a2[c]]";
    String expected = "accaccacc";

    assertEquals(expected, decodeString.decodeString(s));
  }

  @Test
  void testDecodeString3() {
    String s= "2[abc]3[cd]ef";
    String expected = "abcabccdcdcdef";

    assertEquals(expected, decodeString.decodeString(s));
  }

  @Test
  void testDecodeString4() {
    String s= "2[a3[c2[x]]y]";
    String expected = "acxxcxxcxxyacxxcxxcxxy";

    assertEquals(expected, decodeString.decodeString(s));
  }

  @Test
  void testDecodeString5() {
    String s= "10[leetcode]";
    String expected = "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode";

    assertEquals(expected, decodeString.decodeString(s));
  }

  @Test
  void testDecodeString6() {
    String s= "11[ab2[c]de]";
    String expected = "abccdeabccdeabccdeabccdeabccdeabccdeabccdeabccdeabccdeabccdeabccde";

    assertEquals(expected, decodeString.decodeString(s));
  }
}