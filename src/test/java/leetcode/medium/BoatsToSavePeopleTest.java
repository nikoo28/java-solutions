package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoatsToSavePeopleTest {

  private final BoatsToSavePeople boatsToSavePeople;

  BoatsToSavePeopleTest() {
    boatsToSavePeople = new BoatsToSavePeople();
  }

  @Test
  void testNumRescueBoats1() {
    int[] people = {1, 2};
    int limit = 3;

    assertEquals(1, boatsToSavePeople.numRescueBoats(people, limit));
  }

  @Test
  void testNumRescueBoats2() {
    int[] people = {3, 2, 2, 1};
    int limit = 3;

    assertEquals(3, boatsToSavePeople.numRescueBoats(people, limit));
  }

  @Test
  void testNumRescueBoats3() {
    int[] people = {3, 5, 3, 4};
    int limit = 5;

    assertEquals(4, boatsToSavePeople.numRescueBoats(people, limit));
  }

  @Test
  void testNumRescueBoats4() {
    int[] people = {11, 2, 9, 1, 12, 1, 10, 3};
    int limit = 12;

    assertEquals(5, boatsToSavePeople.numRescueBoats(people, limit));
  }
}
