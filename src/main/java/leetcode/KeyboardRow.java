package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nikoo28 on 9/10/17
 */
public class KeyboardRow {

  public static String[] findWords(String[] words) {

    List<String> possibleWords = new ArrayList<>();

    String[] rows = new String[3];
    rows[0] = "qwertyuiopQWERTYUIOP";
    rows[1] = "asdfghjklASDFGHJKL";
    rows[2] = "zxcvbnmZXCVBNM";

    for (String word : words) {

      for (String row : rows) {

        boolean possible = true;
        for (int i = 0; i < word.length(); i++) {
          if (!row.contains(String.valueOf(word.charAt(i)))) {
            possible = false;
            break;
          }
        }

        if (possible)
          possibleWords.add(word);
      }
    }

    String[] op = possibleWords.toArray(new String[possibleWords.size()]);
    return op;
  }

  public static void main(String[] args) {
    String[] r = {"Hello","Alaska","Dad","Peace"};
    String[] words = findWords(r);
    for (String word : words) {
      System.out.println(word);
    }

  }

}
