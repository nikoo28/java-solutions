package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {

  private final CourseSchedule courseSchedule;

  CourseScheduleTest() {
    courseSchedule = new CourseSchedule();
  }

  @Test
  void testCanFinish1() {
    int numCourses = 2;
    int[][] prerequisites = {{1, 0}};
    assertTrue(courseSchedule.canFinish(numCourses, prerequisites));
  }

  @Test
  void testCanFinish2() {
    int numCourses = 2;
    int[][] prerequisites = {{1, 0}, {0, 1}};
    assertFalse(courseSchedule.canFinish(numCourses, prerequisites));
  }

  @Test
  void testCanFinish3() {
    int numCourses = 3;
    int[][] prerequisites = {{0, 1}, {0, 2}, {1, 2}};
    assertTrue(courseSchedule.canFinish(numCourses, prerequisites));
  }
}