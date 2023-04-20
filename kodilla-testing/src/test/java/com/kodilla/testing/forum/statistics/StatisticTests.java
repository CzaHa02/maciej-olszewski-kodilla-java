package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.fourm.statistic.Statistic;
import com.kodilla.testing.fourm.statistic.StatisticCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class StatisticTests {
    private StatisticCalculator calculator;

    @Mock
    Statistic statistic;

    @BeforeEach
    public void setUpMock() {
        MockitoAnnotations.openMocks(this);
        calculator = new StatisticCalculator();
    }

    @Test
    void testWhenPostCountIsZero() {
        when(statistic.postCount()).thenReturn(0);
        calculator.calculateStatistics(statistic);
        Assertions.assertEquals(0, calculator.getPostsCount());
        System.out.println("Liczba postów wynosi " + calculator.getPostsCount());

    }

    @Test
    void testWhenPostCountIsThousand() {
        when(statistic.postCount()).thenReturn(1000);
        calculator.calculateStatistics(statistic);

        Assertions.assertEquals(1000, calculator.getPostsCount());

        Assertions.assertEquals(0, calculator.getAverageCommentsPerPost());

        Assertions.assertEquals(calculator.getAveragePostsPerUser(), calculator.getAveragePostsPerUser());

        Assertions.assertEquals(calculator.getAverageCommentsPerUser(), calculator.getAverageCommentsPerUser());

        System.out.println("Liczba postów wynosi " + calculator.getPostsCount());
    }

    @Test
    void testWhenCommentsCountIsZero() {
        when(statistic.commentsCount()).thenReturn(0);
        calculator.calculateStatistics(statistic);

        Assertions.assertEquals(0, calculator.getCommentsCount());

        Assertions.assertEquals(calculator.getAverageCommentsPerPost(), calculator.getAverageCommentsPerPost());


        Assertions.assertEquals(calculator.getAverageCommentsPerPost(), calculator.getAveragePostsPerUser());

        Assertions.assertEquals(calculator.getAverageCommentsPerPost(), calculator.getAverageCommentsPerUser());


        System.out.println("Liczba komentarzy wynosi " + calculator.getCommentsCount());


    }

    @Test
    void testWhenCommentsCountIsLowerThanPostsCount() {
        calculator.calculateStatistics(statistic);
        if (statistic.commentsCount() < statistic.postCount()) ;

        Assertions.assertEquals(calculator.getAverageCommentsPerPost(), calculator.getAverageCommentsPerPost());


        Assertions.assertEquals(calculator.getAverageCommentsPerPost(), calculator.getAveragePostsPerUser());

        Assertions.assertEquals(calculator.getAverageCommentsPerPost(), calculator.getAverageCommentsPerUser());


    }

    @Test
    void testWhenUserCountIsZero() {
        if (statistic.userNames().size() == 0) ;
        calculator.calculateStatistics(statistic);

        Assertions.assertEquals(0, calculator.getUsersCount());

        Assertions.assertEquals(calculator.getAverageCommentsPerPost(), calculator.getAverageCommentsPerPost());


        Assertions.assertEquals(calculator.getAverageCommentsPerPost(), calculator.getAveragePostsPerUser());

        Assertions.assertEquals(calculator.getAverageCommentsPerPost(), calculator.getAverageCommentsPerUser());


        System.out.println("Liczba użytkowników wynosi " + calculator.getUsersCount());
    }

    @Test
    void testWhenUserCountIsHundred() {
        List<String> users = new ArrayList<>();
        for (int i = 100; i < 100; i++) {


            when(statistic.userNames()).thenReturn(users);
            calculator.calculateStatistics(statistic);

            Assertions.assertEquals(100, calculator.getUsersCount());

            Assertions.assertEquals(calculator.getAverageCommentsPerPost(), calculator.getAverageCommentsPerPost());


            Assertions.assertEquals(calculator.getAverageCommentsPerPost(), calculator.getAveragePostsPerUser());

            Assertions.assertEquals(calculator.getAverageCommentsPerPost(), calculator.getAverageCommentsPerUser());


        }
    }
    @Test
    void testTest(){

        System.out.println( calculator.showStatistic());
    }
}





