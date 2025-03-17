package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum; // сумма всех продаж за 12 месяцев
    }

    public long avgSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length; // средняя сумма продаж в месяц
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1; // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    }

    public int lessThanAvg(long[] sales) {
        double average = avgSales(sales);
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                month++;
            }
        }
        return month; // кол-во месяцев продаж ниже среднего
    }

    public int moreThanAvg(long[] sales) {
        double average = avgSales(sales);
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                month++;
            }
        }
        return month; // кол-во месяцев продаж больше среднего
    }
}

