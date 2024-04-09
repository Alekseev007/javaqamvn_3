package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
        return total;
    }

    public long averageSales(long[] sales) {
        long total = 0;
        long average = total;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
            average = total / (i + 1);
        }
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int quaBelowAverage(long[] sales) {
        int monthBelowAverage = 0;
        long average = averageSales(sales);
        for (long number : sales) {
            if (number < average) {
                monthBelowAverage = monthBelowAverage + 1;
            }

        }
        return monthBelowAverage;
    }

    public int quaAboveAverage(long[] sales) {
        int monthAboveAverage = 0;
        long average = averageSales(sales);
        for (long numb : sales) {
            if (numb > average) {
                monthAboveAverage = monthAboveAverage + 1;
            }
        }
        return monthAboveAverage;
    }
}

