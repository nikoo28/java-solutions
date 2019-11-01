package leetcode;

/**
 * Created by nikoo28 on 12/17/17 3:09 PM
 */

class RansomeNote {

  public boolean canConstruct(String ransomNote, String magazine) {

    char[] magazineSet = new char[26];
    char[] magazineChars = magazine.toCharArray();
    char[] ransomeNoteChars = ransomNote.toCharArray();

    for (char aChar : magazineChars) magazineSet[aChar - 'a']++;
    for (char aChar : ransomeNoteChars) if (magazineSet[aChar - 'a']-- == 0) return false;
    return true;
  }

}
