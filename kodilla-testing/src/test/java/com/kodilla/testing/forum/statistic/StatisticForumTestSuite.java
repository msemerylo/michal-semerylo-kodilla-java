package com.kodilla.testing.forum.statistic;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticForumTestSuite {
    private Statistics statisticsMock;
    private StatisticForum statisticForum;

    @BeforeEach
    public void beforeTest(){
        statisticsMock = mock(Statistics.class);
        List<String>newList = new ArrayList<>();
        for (int n=0; n<100; n++){
            newList.add("ForumUser");
        }
        when(statisticsMock.usersNames()).thenReturn(newList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);
        statisticForum = new StatisticForum();

    }
    @Test
    public void testStatisticForumWith0Posts(){
        //given
        when(statisticsMock.postsCount()).thenReturn(0);
        //when
        statisticForum.calculateAdvStatistic(statisticsMock);
        //then
        assertEquals(0, statisticForum.getNumberOfPosts());
        assertEquals(0,statisticForum.getPostsPerUser());
        assertEquals(0, statisticForum.getCommentsPerPosts());
    }
    @Test
    public void testStatisticForumWith1000Posts(){
        //given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //when
        statisticForum.calculateAdvStatistic(statisticsMock);
        //then
        assertEquals(1000,statisticForum.getNumberOfPosts());
        assertEquals(10,statisticForum.getPostsPerUser());
        assertEquals(0.02,statisticForum.getCommentsPerPosts());
    }
    @Test
    public void testStatisticForumWith0Comments(){
        //given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //when
        statisticForum.calculateAdvStatistic(statisticsMock);
        //then
        assertEquals(0, statisticForum.getNumberOfComments());
        assertEquals(0,statisticForum.getCommentsPerUser());
        assertEquals(0, statisticForum.getCommentsPerPosts());
    }
    @Test
    public void testStatisticForumMorePostsThanComments(){
        //given
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(20);
        //when
        statisticForum.calculateAdvStatistic(statisticsMock);
        //then
        assertEquals(10,statisticForum.getNumberOfComments());
        assertEquals(20,statisticForum.getNumberOfPosts());
        assertEquals(0.1,statisticForum.getCommentsPerUser());
        assertEquals(0.5,statisticForum.getCommentsPerPosts());
    }
    @Test
    public void testStatisticsForumMoreCommentsThanPosts(){
        //given
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.postsCount()).thenReturn(10);
        //when
        statisticForum.calculateAdvStatistic(statisticsMock);
        //then
        assertEquals(20,statisticForum.getNumberOfComments());
        assertEquals(10,statisticForum.getNumberOfPosts());
        assertEquals(0.2,statisticForum.getCommentsPerUser());
        assertEquals(2,statisticForum.getCommentsPerPosts());
    }
    @Test
    public void testStatisticsForumWith0Users(){
        //given
        List<String> newList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(newList);
        //when
        statisticForum.calculateAdvStatistic(statisticsMock);
        //then
        assertEquals(0,statisticForum.getNumberOfUsers());
        assertEquals(0,statisticForum.getPostsPerUser());
        assertEquals(0,statisticForum.getCommentsPerUser());
    }
    @Test
    public void testStatisticForumWith100Users(){
        //when
        statisticForum.calculateAdvStatistic(statisticsMock);
        //then
        assertEquals(100,statisticForum.getNumberOfUsers());
        assertEquals(0.1,statisticForum.getPostsPerUser());
        assertEquals(0.2,statisticForum.getCommentsPerUser());
    }

}
