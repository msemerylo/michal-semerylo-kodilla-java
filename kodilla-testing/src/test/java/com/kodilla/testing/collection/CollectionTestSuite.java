package com.kodilla.testing.collection;

import org.junit.BeforeClass;
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




    @Test
     public void testOddNumbersExterminatoryEmptyList(){
        //given
        List<Integer> emptyList = new ArrayList<Integer>() ;
        //when
        List<Integer> resoult = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing Empty List");
        //them
        Assertions.assertEquals(emptyList, resoult);
    }
    @Test
    public void testOddNumbersExterminatiryNormalList(){
        //given
        List<Integer> normalList = new ArrayList<Integer>();
        normalList.add(8);
        normalList.add(12);
        normalList.add(6);

        List<Integer> resoultList = new ArrayList<Integer>();
        resoultList.add(8);
        resoultList.add(12);
        resoultList.add(6);

        //when
        List<Integer> comparisionList = OddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing Normal List");
        //then
        Assertions.assertEquals(resoultList, comparisionList);

    }




}
