package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumTest() {
//        StatsService service = new StatsService();
//        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual); // сумма всех продаж за 12 месяцев
    }

    @Test
    public void avgSales() {
        long actual = service.avgSales(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual); // средняя сумма продаж в месяц
    }

    @Test
    public void maxSales() {
        int actual = service.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual); //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    }

    @Test
    public void minSales() {
        int actual = service.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual); //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    }

    @Test
    public void lessThanAvg() {
        int actual = service.lessThanAvg(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual); // кол-во месяцев продаж ниже среднего
    }

    @Test
    public void moreThanAvg() {
        int actual = service.moreThanAvg(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual); // кол-во месяцев продаж больше среднего
    }
}
