package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    void testCalculator(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //when
        double sum = calculator.add(9.2,1.7);
        double dif = calculator.sub(8.9,5.3);
        double pro = calculator.mul(2.3,4.3);
        double quo = calculator.div(7.8,1.2);
        //then
        Assertions.assertEquals(10.9,sum,0.01);
        Assertions.assertEquals(3.6,dif,0.01);
        Assertions.assertEquals(9.89,pro,0.01);
        Assertions.assertEquals(6.5,quo,0.01);
    }

}
