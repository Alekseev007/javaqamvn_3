package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test
    public void salesSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void salesAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAver = 15;
        long actualAver = service.averageSales(sales);
        Assertions.assertEquals(expectedAver, actualAver);
    }

    @Test
    public void monthMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNum = 8;
        long actualNum = service.maxSales(sales);
        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void monthMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNum = 9;
        long actualNum = service.minSales(sales);
        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void monthUnderAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNum = 5;
        long actualNum = service.quaBelowAverage(sales);
        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void monthAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNum = 5;
        long actualNum = service.quaAboveAverage(sales);
        Assertions.assertEquals(expectedNum, actualNum);
    }
}
