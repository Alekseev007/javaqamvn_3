package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
        return total;
    }

    public int averageSales(int[] sales) {
        int total = 0;
        int average = total;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
            average = total / (i + 1);
        }
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int quaBelowAverage(int[] sales) {
        int monthBelowAverage = 0;
        int average = averageSales(sales);
        for (int number : sales) {
            if (number < average) {
                monthBelowAverage = monthBelowAverage + 1;
            }

        }
        return monthBelowAverage;
    }

    public int quaAboveAverage(int[] sales) {
        int monthAboveAverage = 0;
        int average = averageSales(sales);
        for (int numb : sales) {
            if (numb > average) {
                monthAboveAverage = monthAboveAverage + 1;
            }
        }
        return monthAboveAverage;
    }
}

