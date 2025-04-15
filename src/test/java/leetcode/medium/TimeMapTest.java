package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeMapTest {

  private final TimeMap timeMap;

  TimeMapTest() {
    timeMap = new TimeMap();
  }

  @Test
  void testSetAndGet1() {
    timeMap.set("foo", "bar", 1);
    assertEquals("bar", timeMap.get("foo", 1));
    assertEquals("bar", timeMap.get("foo", 3));
  }

  @Test
  void testSetAndGet2() {
    timeMap.set("foo", "bar", 1);
    timeMap.set("foo", "baz", 2);
    assertEquals("bar", timeMap.get("foo", 1));
    assertEquals("baz", timeMap.get("foo", 2));
    assertEquals("baz", timeMap.get("foo", 3));
  }
}