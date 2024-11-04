package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayUtilsTest {

    // Test Case for Path 1: No entries fall within the specified range, expecting -999
    @Test
    public void testNoValidEntries() {
        int[] values = {-999};
        assertEquals(-999, ArrayUtils.calculateAverage(values, 1, 10));
    }

    // Test Case for Path 2: All values are outside the allowed range
    @Test
    public void testEntriesOutsideRange() {
        int[] values = {20, 30, 40, -999};
        assertEquals(-999, ArrayUtils.calculateAverage(values, 1, 10));
    }

    // Test Case for Path 3: Some values are within the specified range, average is calculated
    @Test
    public void testValidEntriesWithinRange() {
        int[] values = {5, 7, 8, -999};
        assertEquals(6, ArrayUtils.calculateAverage(values, 5, 10));
    }

    // Test Case for Path 4: Loop exits after reaching the limit of 100 entries
    @Test
    public void testMaxInputLimit() {
        int[] values = new int[101];
        for (int i = 0; i < 100; i++) {
            values[i] = 5; // Values within the range
        }
        values[100] = -999;
        assertEquals(5, ArrayUtils.calculateAverage(values, 1, 10));
    }
}
