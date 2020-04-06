package codility.painless;

/**
 * Created by nikoo28 on 2019-08-25 14:21
 */

class CroppedMessage {

  private String solution(String message, int k) {
    // write your code in Java SE 8

    String[] splits = message.split(" ");

    if (splits[0].length() > k) return "";

    if (splits[0].length() == k) return splits[0];

    StringBuilder sb = new StringBuilder(splits[0]);
    int idx = 1;
    while (idx < splits.length) {
      int newLength = sb.length() + 1 + splits[idx].length();
      if (newLength < k) {
        sb.append(" ");
        sb.append(splits[idx]);
        idx++;
        continue;
      }

      if (newLength == k) {
        sb.append(" ");
        sb.append(splits[idx]);
        return sb.toString();
      }

      return sb.toString();
    }

    return sb.toString();
  }

  public static void main(String[] args) {

    CroppedMessage croppedMessage = new CroppedMessage();
    System.out.println(croppedMessage.solution("Codility We test coders", 14));
    System.out.println(croppedMessage.solution("Why not", 100));
    System.out.println(croppedMessage.solution("asda", -1));
    System.out.println(croppedMessage.solution("The quick brown fox jumps over the lazy dog", 39));
    System.out.println(
        croppedMessage.solution("123456789123456789The quick brown fox jumps over the lazy dog", 39));
    System.out.println(
        croppedMessage.solution("123456789123456789The quick brown fox jumps over the lazy dog", 21));
  }

}
