package hackerrank.algorithms.search;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumLossTest {

  private MinimumLoss minimumLoss;

  public MinimumLossTest() {
    minimumLoss = new MinimumLoss();
  }

  @Test
  void testMinimumLoss1() {
    long[] prices = {20, 7, 8, 2, 5};
    List<Long> priceList = Arrays.stream(prices).boxed().collect(Collectors.toList());

    assertEquals(2, minimumLoss.minimumLoss(priceList));
  }

  @Test
  void testMinimumLoss2() {
    long[] prices = {5, 10, 3};
    List<Long> priceList = Arrays.stream(prices).boxed().collect(Collectors.toList());

    assertEquals(2, minimumLoss.minimumLoss(priceList));
  }

  @Test
  void testMinimumLoss3() {
    long[] prices = {2, 3, 4, 1};
    List<Long> priceList = Arrays.stream(prices).boxed().collect(Collectors.toList());

    assertEquals(1, minimumLoss.minimumLoss(priceList));
  }
}