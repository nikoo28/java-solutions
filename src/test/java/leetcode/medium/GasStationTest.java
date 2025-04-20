package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {

  private final GasStation gasStation;

  GasStationTest() {
    gasStation = new GasStation();
  }

  @Test
  void testCanCompleteCircuit1() {
    int[] gas = {1, 2, 3, 4, 5};
    int[] cost = {3, 4, 5, 1, 2};
    assertEquals(3, gasStation.canCompleteCircuit(gas, cost));
  }

  @Test
  void testCanCompleteCircuit2() {
    int[] gas = {2, 3, 4};
    int[] cost = {3, 4, 3};
    assertEquals(-1, gasStation.canCompleteCircuit(gas, cost));
  }

  @Test
  void testCanCompleteCircuit3() {
    int[] gas = {5, 1, 2, 3, 4};
    int[] cost = {4, 4, 1, 5, 1};
    assertEquals(4, gasStation.canCompleteCircuit(gas, cost));
  }

  @Test
  void testCanCompleteCircuit4() {
    int[] gas = {1, 2, 3};
    int[] cost = {2, 2, 2};
    assertEquals(1, gasStation.canCompleteCircuit(gas, cost));
  }
}
