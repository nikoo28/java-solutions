package codility.painless;

/**
 * Created by nikoo28 on 2019-08-25 19:51
 */

class OddOccurencesInAnArray {

  public int solution(int[] A) {
    // write your code in Java SE 8

    int answer = 0;
    for (int i : A) {
      answer = answer ^ i;
    }

    return answer;
  }

}
