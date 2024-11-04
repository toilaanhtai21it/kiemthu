package org.example;

public class ArrayUtils {
    public static int calculateAverage(int[] values, int min, int max) {
        int index = 0;
        int count = 0;
        int validCount = 0;
        int total = 0;

        while ((values[index] != -999) && (count < 100)) {
            count++;
            if ((values[index] >= min) && (values[index] <= max)) {
                validCount++;
                total += values[index];
            }
            index++;
        }

        if (validCount > 0) {
            return total / validCount;
        } else {
            return -999;
        }
    }
}
