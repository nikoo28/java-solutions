package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnlineStockSpanTest {

  private OnlineStockSpan onlineStockSpan;

  public OnlineStockSpanTest() {
    onlineStockSpan = new OnlineStockSpan();
  }

  @Test
  void testCalculateSpans1() {
    int[] prices = {100, 80, 60, 70, 60, 75, 85};
    int[] spans = {1, 1, 1, 2, 1, 4, 6};

    int[] actualSpans = onlineStockSpan.calculateSpans(prices);
    assertArrayEquals(spans, actualSpans);
  }

  @Test
  void testCalculateSpans2() {
    int[] prices = {100, 60, 70, 65, 80, 85, 200};
    int[] spans = {1, 1, 2, 1, 4, 5, 7};

    int[] actualSpans = onlineStockSpan.calculateSpans(prices);
    assertArrayEquals(spans, actualSpans);
  }

  @Test
  void testCalculateSpans3() {
    int[] prices = {100};
    int[] spans = {1};

    int[] actualSpans = onlineStockSpan.calculateSpans(prices);
    assertArrayEquals(spans, actualSpans);
  }

  @Test
  void testCalculateSpans4() {
    int[] prices = {100, 90, 80, 70, 60, 50, 40};
    int[] spans = {1, 1, 1, 1, 1, 1, 1};

    int[] actualSpans = onlineStockSpan.calculateSpans(prices);
    assertArrayEquals(spans, actualSpans);
  }

  @Test
  void testCalculateSpans5() {
    int[] prices = {100, 110, 120, 130, 140, 150, 160};
    int[] spans = {1, 2, 3, 4, 5, 6, 7};

    int[] actualSpans = onlineStockSpan.calculateSpans(prices);
    assertArrayEquals(spans, actualSpans);
  }

  @Test
  void testCalculateSpans6() {
    int[] prices = {10, 10, 10, 10};
    int[] spans = {1, 1, 1, 1};

    int[] actualSpans = onlineStockSpan.calculateSpans(prices);
    assertArrayEquals(spans, actualSpans);
  }
}