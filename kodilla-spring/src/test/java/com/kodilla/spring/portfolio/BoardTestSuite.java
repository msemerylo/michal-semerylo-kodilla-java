package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Autowired
    private Board board;
    @Test
    public void testTaskAdd() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //when
        board.getToDoList().getTasks().add("task to do");
        board.getInProgressList().getTasks().add("task in progress");
        board.getDoneList().getTasks().add("task done");
        //then
        Assertions.assertEquals("task to do", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("task in progress", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("task done",board.getDoneList().getTasks().get(0));

        System.out.println(board.getToDoList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
    }
}
