package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author nikoo28 on 9/15/17
 */
class AsciiDistance {

  private int distance(String str1, String str2) {

    char[] histogram = new char[26];
    Set<Character> str1Set = new HashSet<>();
    Set<Character> str2Set = new HashSet<>();
    for (int i = 0; i < str1.length(); i++) {
      histogram[str1.charAt(i) - 'a']++;
      str1Set.add(str1.charAt(i));
    }

    for (int i = 0; i < str2.length(); i++) {
      histogram[str2.charAt(i) - 'a']++;
      str2Set.add(str2.charAt(i));
    }

    Set<Character> unionSet = new HashSet<>();
    unionSet.addAll(str1Set);
    unionSet.addAll(str2Set);

    List<Character> intersectionSet = new ArrayList<>(Math.max(str1Set.size(), str2Set.size()));
    intersectionSet.addAll(str1Set);
    intersectionSet.retainAll(str2Set);

    List<Character> differenceSet = new ArrayList<>(str1Set.size());
    differenceSet.addAll(unionSet);
    differenceSet.removeAll(intersectionSet);

    int sum = 0;
    for (Character character : differenceSet) {
      sum += character * histogram[character - 'a'];
    }

    return sum;
  }

  public static void main(String[] args) {

    AsciiDistance asciiDistance = new AsciiDistance();
    System.out.println(asciiDistance.distance("thought", "sloughs"));

  }


}
