package leetcode.easy;

/**
 * Created by nikoo28 on 2019-08-17 19:34
 */

class FindWordsThatCanBeFormedByCharacters {

  private int countCharacters(String[] words, String chars) {

    int sumOfLengths = 0;

    for (String word : words) {
      StringBuilder sb = new StringBuilder(chars);

      boolean flag = true;
      for (int i = 0; i < word.length(); i++) {
        int idx = sb.indexOf(String.valueOf(word.charAt(i)));
        if (idx == -1) {
          flag = false;
          break;
        }
        sb.deleteCharAt(idx);
      }

      if (flag)
        sumOfLengths += word.length();
    }

    return sumOfLengths;
  }

  public static void main(String[] args) {

    FindWordsThatCanBeFormedByCharacters findWordsThatCanBeFormedByCharacters = new FindWordsThatCanBeFormedByCharacters();

    String[] words = {"hello", "world", "leetcode"};
    String chars = "welldonehoneyr";
    System.out.println(findWordsThatCanBeFormedByCharacters.countCharacters(words, chars));

    words = new String[]{"cat", "bt", "hat", "tree"};
    chars = "atach";
    System.out.println(findWordsThatCanBeFormedByCharacters.countCharacters(words, chars));
  }

}
