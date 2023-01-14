package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("List Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("List Test Case: end");
    }
    @DisplayName("When created List is empty, "+"then should return true")
    @Test
     void testOddNumbersExterminatoryEmptyList(){
        //given
        List<Integer> number = new ArrayList<Integer>() ;
        //when
        boolean resoult = number.isEmpty();
        boolean expectedResult = true;
        //them
        Assertions.assertEquals(expectedResult, resoult);


    }
    @Test
    void testOddNumbersExterminatoryNormalList() {
        //given
        List<Integer> number = new ArrayList<Integer>() ;
        //when
        boolean resoult = number.size()>0;
        boolean expectedResoult = true;
        //them
        Assertions.assertEquals(expectedResoult,resoult);
    }


}
