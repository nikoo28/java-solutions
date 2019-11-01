package leetcode;

class ReverseString {

  public String reverseString(String s) {

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
      stringBuilder.append(s.charAt(i));
    }

    return stringBuilder.toString();
  }

}
