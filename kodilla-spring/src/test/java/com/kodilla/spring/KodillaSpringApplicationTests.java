package com.kodilla.spring;

import com.kodilla.spring.forum.ForumUser;
import com.kodilla.spring.forum.User;
import com.kodilla.spring.library.LibraryConfig;
import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KodillaSpringApplicationTests {

    @Test
    void testCircleLoadedIntroContainer(){
        //given
        ApplicationContext context=
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("circle");
        //when
        String name = shape.getShapeName();
        //then
        assertEquals("This is a circle.", name);
    }
    @Test
    void testTriangleLoadedIntoContainer(){
        //given
        ApplicationContext context=
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("triangle");
        //when
        String name = shape.getShapeName();
        //then
        assertEquals("This is a triangle.", name);
    }
    @Test
    void testSquareLoadedIntoContainer(){
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("createSquare");
        //when
        String name = shape.getShapeName();
        //then
        assertEquals("This is a square.",name);
    }
    @Test
    void testShapeLoadedIntoContainer(){
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("chosenShape");
        //when
        String name = shape.getShapeName();
        //then
        System.out.println("Chosen shape says: " + name);
    }
    @Test
    void contextLoads(){

    }
    @Test
    void testGetUserName(){
        //given
        ApplicationContext context=
                new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        User user = context.getBean(ForumUser.class);
        //when
        String name = user.getUsername();
        //then
        assertEquals("John Smith",name);
    }
    @Test
    void testContext(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //when & then
        System.out.println("== Beans List: ==>>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<<== Beans List ==");
    }

}
