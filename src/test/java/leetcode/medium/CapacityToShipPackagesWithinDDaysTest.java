package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapacityToShipPackagesWithinDDaysTest {

  private final CapacityToShipPackagesWithinDDays capacityToShipPackagesWithinDDays;

  CapacityToShipPackagesWithinDDaysTest() {
    capacityToShipPackagesWithinDDays = new CapacityToShipPackagesWithinDDays();
  }

  @Test
  void testShipWithinDays1() {
    int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int D = 5;
    assertEquals(15, capacityToShipPackagesWithinDDays.shipWithinDays(weights, D));
  }

  @Test
  void testShipWithinDays2() {
    int[] weights = {3, 2, 2, 4, 1, 4};
    int D = 3;
    assertEquals(6, capacityToShipPackagesWithinDDays.shipWithinDays(weights, D));
  }

  @Test
  void testShipWithinDays3() {
    int[] weights = {1, 2, 3, 1, 1};
    int D = 4;
    assertEquals(3, capacityToShipPackagesWithinDDays.shipWithinDays(weights, D));
  }

  @Test
  void testShipWithinDays4() {
    int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int D = 1;
    assertEquals(55, capacityToShipPackagesWithinDDays.shipWithinDays(weights, D));
  }
}