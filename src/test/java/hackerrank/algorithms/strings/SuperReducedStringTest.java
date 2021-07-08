package hackerrank.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperReducedStringTest {

  private final SuperReducedString superReducedString;

  public SuperReducedStringTest() {
    superReducedString = new SuperReducedString();
  }

  @Test
  void testSuperReducedString1() {
    assertEquals("Empty String", superReducedString.superReducedString("abba"));
    assertEquals("Empty String", superReducedString.superReducedStringUsingStacks("abba"));
  }

  @Test
  void testSuperReducedString2() {
    assertEquals("abd", superReducedString.superReducedString("aaabccddd"));
    assertEquals("abd", superReducedString.superReducedStringUsingStacks("aaabccddd"));
  }

  @Test
  void testSuperReducedString3() {
    assertEquals("tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh",
        superReducedString.superReducedString("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh"));
    assertEquals("tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh",
        superReducedString.superReducedStringUsingStacks("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh"));
  }

  @Test
  void testSuperReducedString4() {
    assertEquals("Empty String", superReducedString.superReducedString("mwkommokwmxjivkkvijxshscbbcshsgwdyqqydwgzpnlzzlnpzvfeaiiaefvyeqjccjqeymhqhiihqhmhaomkkmoahhddymmyddh"));
    assertEquals("Empty String", superReducedString.superReducedStringUsingStacks("mwkommokwmxjivkkvijxshscbbcshsgwdyqqydwgzpnlzzlnpzvfeaiiaefvyeqjccjqeymhqhiihqhmhaomkkmoahhddymmyddh"));
  }

  @Test
  void testSuperReducedString5() {
    assertEquals("Empty String", superReducedString.superReducedString("oagciicgaoyjmahhamjymmwjnnjwmmvpxhpphxpvlikappakilyygvkkvgyymlpfddfplmhiodvvdoihfxpkggkpxfuevvuuvveu"));
    assertEquals("Empty String", superReducedString.superReducedStringUsingStacks("oagciicgaoyjmahhamjymmwjnnjwmmvpxhpphxpvlikappakilyygvkkvgyymlpfddfplmhiodvvdoihfxpkggkpxfuevvuuvveu"));
  }

  @Test
  void testSuperReducedString6() {
    assertEquals("acdqgacdqj", superReducedString.superReducedString("acdqglrfkqyuqfjkxyqvnrtysfrzrmzlygfveulqfpdbhlqdqrrqdqlhbdpfqluevfgylzmrzrfsytrnvqyxkjfquyqkfrlacdqj"));
    assertEquals("acdqgacdqj", superReducedString.superReducedStringUsingStacks("acdqglrfkqyuqfjkxyqvnrtysfrzrmzlygfveulqfpdbhlqdqrrqdqlhbdpfqluevfgylzmrzrfsytrnvqyxkjfquyqkfrlacdqj"));
  }
}