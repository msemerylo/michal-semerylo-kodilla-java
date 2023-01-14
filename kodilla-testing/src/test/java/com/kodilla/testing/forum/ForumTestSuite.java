package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;


public class ForumTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("When created SimpleUser with name, "+"then getUsername should return correct name")

    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Andrzej z Bohukał");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing "+result);
        //Then
        Assertions.assertEquals("Andrzej z Bohukał",result);
    }
    @DisplayName("when create SimpleUser with name, "+"then getUsername should return correct name")


    @Test
    void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Andrzej z Bohukał");

        //When
        String resoult = simpleUser.getUsername();

        String expectedResult = "theForumUser";

        //Then
        Assertions.assertEquals(expectedResult, resoult);

    }
}
