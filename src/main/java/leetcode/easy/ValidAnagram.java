package leetcode.easy;

/**
 * Created by nikoo28 on 9/23/18 12:40 PM
 */

class ValidAnagram {

  public boolean isAnagram(String str1, String str2) {

    // Convert both to lowercase to ignore case match
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // Strip of all the white spaces
    str1 = str1.replace(" ", "");
    str2 = str2.replace(" ", "");

    // Initialize the bucket array
    int[] counts = new int[26];

    // Fill the buckets
    for (int i = 0; i < str1.length(); i++) {
      counts[str1.charAt(i) - 'a']++;
    }

    // Empty the buckets
    for (int i = 0; i < str2.length(); i++) {
      counts[str2.charAt(i) - 'a']--;
    }

    // Check if all buckets are empty
    for (int count : counts) {
      if (count != 0)
        return false;
    }

    return true;
  }

}
