package hackerrank.algorithms.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikoo28 on 10/10/20 4:48 PM
 */

public class TwoStrings {

  public String twoStrings(String s1, String s2) {

    Set<Character> s1Set = new HashSet<>();
    Set<Character> s2Set = new HashSet<>();

    //creating the set of string1
    for(char c : s1.toCharArray()) {
      s1Set.add(c);
    }
    //creating the set of string2
    for(char c : s2.toCharArray()) {
      s2Set.add(c);
    }

    // store the set intersection in s1Set
    s1Set.retainAll(s2Set);

    if (!s1Set.isEmpty())
      return "YES";

    return "NO";
  }

}
