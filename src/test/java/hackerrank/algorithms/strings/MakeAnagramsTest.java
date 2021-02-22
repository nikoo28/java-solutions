package hackerrank.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 2/21/21 4:03 AM
 */

class MakeAnagramsTest {

  private MakeAnagrams makeAnagrams;

  public MakeAnagramsTest() {
    makeAnagrams = new MakeAnagrams();
  }

  @Test
  void testMakeAnagrams1() {
    String s1 = "tars";
    String s2 = "rat";

    assertEquals(1, makeAnagrams.makingAnagrams(s1, s2));
  }

  @Test
  void testMakeAnagrams2() {
    String s1 = "abc";
    String s2 = "cde";

    assertEquals(4, makeAnagrams.makingAnagrams(s1, s2));
  }

  @Test
  void testMakeAnagrams3() {
    String s1 = "absdjkvuahdakejfnfauhdsaavasdlkj";
    String s2 = "djfladfhiawasdkjvalskufhafablsdkashlahdfa";

    assertEquals(19, makeAnagrams.makingAnagrams(s1, s2));
  }

}