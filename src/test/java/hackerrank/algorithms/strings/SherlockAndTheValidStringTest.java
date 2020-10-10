package hackerrank.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by nikoo28 on 10/9/20 7:15 PM
 */

class SherlockAndTheValidStringTest {

  SherlockAndTheValidString sherlockAndTheValidString = new SherlockAndTheValidString();

  @Test
  void testIsValid1() {
    String str = "abcc";

    assertEquals("YES", sherlockAndTheValidString.isValid(str));
  }

  @Test
  void testIsValid2() {
    String str = "aabbccddeefghi";

    assertEquals("NO", sherlockAndTheValidString.isValid(str));
  }

  @Test
  void testIsValid3() {
    String str = "abcdefghhgfedecba";

    assertEquals("YES", sherlockAndTheValidString.isValid(str));
  }

  @Test
  void testIsValid4() {
    String str = "aabbcd";

    assertEquals("NO", sherlockAndTheValidString.isValid(str));
  }

  @Test
  void testIsValid5() {
    String str = "aaabbbcc";

    assertEquals("NO", sherlockAndTheValidString.isValid(str));
  }

  @Test
  void testIsValid6() {
    String str = "abbac";

    assertEquals("YES", sherlockAndTheValidString.isValid(str));
  }

  @Test
  void testIsValid7() {
    String str = "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfb" +
        "iiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbd" +
        "acgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgag" +
        "fediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacb" +
        "hbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgi" +
        "gebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdia" +
        "bcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhff" +
        "iageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafc" +
        "cdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgc" +
        "hhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";

    assertEquals("YES", sherlockAndTheValidString.isValid(str));
  }
}