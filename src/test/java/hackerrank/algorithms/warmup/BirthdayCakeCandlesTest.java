package hackerrank.algorithms.warmup;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 2/14/21 1:10 AM
 */

class BirthdayCakeCandlesTest {

  private final BirthdayCakeCandles birthdayCakeCandles;

  public BirthdayCakeCandlesTest() {
    birthdayCakeCandles = new BirthdayCakeCandles();
  }

  @Test
  void testBirthdayCakeCandles1() {
    List<Integer> candles = new ArrayList<>();
    candles.add(3);
    candles.add(2);
    candles.add(1);
    candles.add(3);

    assertEquals(2, birthdayCakeCandles.birthdayCakeCandles(candles));
    assertEquals(2, birthdayCakeCandles.birthdayCakeCandlesStream(candles));
  }

  @Test
  void testBirthdayCakeCandles2() {
    List<Integer> candles = new ArrayList<>();
    candles.add(4);
    candles.add(4);
    candles.add(1);
    candles.add(3);

    assertEquals(2, birthdayCakeCandles.birthdayCakeCandles(candles));
    assertEquals(2, birthdayCakeCandles.birthdayCakeCandlesStream(candles));
  }
}