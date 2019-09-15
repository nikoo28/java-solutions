package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 2019-09-14 18:51
 */

public class TopKFrequentWordsTest {

  private TopKFrequentWords topKFrequentWords = new TopKFrequentWords();

  @Test
  public void testTopKFrequent1() {

    String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
    List<String> result = topKFrequentWords.topKFrequent(words, 2);
    List<String> expectedResult = new ArrayList<>();
    expectedResult.add("i");
    expectedResult.add("love");

    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void testTopKFrequent2() {

    String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
    List<String> result = topKFrequentWords.topKFrequent(words, 4);
    List<String> expectedResult = new ArrayList<>();
    expectedResult.add("the");
    expectedResult.add("is");
    expectedResult.add("sunny");
    expectedResult.add("day");

    Assert.assertEquals(expectedResult, result);
  }

}
