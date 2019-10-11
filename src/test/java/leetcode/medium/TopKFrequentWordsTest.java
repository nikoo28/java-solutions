package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 2019-09-14 18:51
 */

class TopKFrequentWordsTest {

  private TopKFrequentWords topKFrequentWords = new TopKFrequentWords();

  @Test
  void testTopKFrequent1() {

    String[] words = {"i", "love", "studyalgorithms", "i", "love", "coding"};
    List<String> expectedResult = new ArrayList<>();
    expectedResult.add("i");
    expectedResult.add("love");

    List<String> result = topKFrequentWords.topKFrequent(words, 2);
    assertEquals(expectedResult, result);
  }

  @Test
  void testTopKFrequent2() {

    String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
    List<String> expectedResult = new ArrayList<>();
    expectedResult.add("the");
    expectedResult.add("is");
    expectedResult.add("sunny");
    expectedResult.add("day");

    List<String> result = topKFrequentWords.topKFrequent(words, 4);
    assertEquals(expectedResult, result);
  }

}
