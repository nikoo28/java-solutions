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
    for (char c : s1.toCharArray()) {
      s1Set.add(c);
    }
    //creating the set of string2
    for (char c : s2.toCharArray()) {
      s2Set.add(c);
    }

    // store the set intersection in s1Set
    s1Set.retainAll(s2Set);

    if (!s1Set.isEmpty())
      return "YES";

    return "NO";
  }

  public String twoStringsMethodTwo(String s1, String s2) {

    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    // Create a frequency array of size 26
    char[] freq = new char[26];

    // Increase the frequency of each character for string s2
    for (int i = 0; i < s2.length(); i++) {
      freq[s2.charAt(i) - 'a']++;
    }

    // Check each character in string s1 for frequency.
    // If the frequency is greater than 0, it means you found a substring. Simply return YES
    for (int i = 0; i < s1.length(); i++) {
      if (freq[s1.charAt(i) - 'a'] > 0) {
        return "YES";
      }
    }

    return "NO";
  }

}
