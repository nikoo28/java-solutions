package hackerrank.algorithms.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
public class SherLockAndCostTest {

    @Test
    public void testSherlockAndCostProblem_EmptyList() {
        assertEquals(0, SherLockAndCost.sherlockAndCostProblem(List.of(1)));
    }

    @Test
    public void testSherlockAndCostProblem_SingleElementList() {
        assertEquals(0, SherLockAndCost.sherlockAndCostProblem(List.of(1)));
    }

    @Test
    public void testSherlockAndCostProblem_PositiveNumbers() {
        assertEquals(8, SherLockAndCost.sherlockAndCostProblem(List.of(1, 2, 3, 4, 5)));
    }

    @Test
    public void testSherlockAndCostProblem_NegativeNumbers() {
        assertEquals(0, SherLockAndCost.sherlockAndCostProblem(List.of(-1, -2, -3, -4, -5)));
    }

    @Test
    public void testSherlockAndCostProblem_MixedNumbers() {
        assertEquals(8, SherLockAndCost.sherlockAndCostProblem(List.of(1, -2, 3, -4, 5)));
    }
}
