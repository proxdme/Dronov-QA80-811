package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void findMaxNegativeValues() {
        StatisticsService service = new StatisticsService();

        long[] incomesWithNegatives = {-5, -8, -2, -12, -1};
        long expected = -1; // допустим он понимает отрицательные знаечния.

        long actual = service.findMax(incomesWithNegatives);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxSingleElementArray() {
        StatisticsService service = new StatisticsService();

        long[] singleElementArray = {7};
        long expected = 7;

        long actual = service.findMax(singleElementArray);

        Assertions.assertEquals(expected, actual);
    }

}