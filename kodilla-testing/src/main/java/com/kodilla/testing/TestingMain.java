package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {

            if (result.equals("theForumUser")) {
                System.out.println("test OK");
            } else {
                System.out.println("Error!");
            }
        }
        Calculator calculator = new Calculator();

        Integer result2 = calculator.getCalculatorAdd();
        if (result2.equals(13)) {
            System.out.println("Calculator add test: OK");
        } else {
            System.out.println("Calculator add test: Error!");
        }
        System.out.println(result2);

        Integer result3 = calculator.getCalculatorSubstrack();
        if (result3.equals(4)) {
            System.out.println("Calculator substrack test : OK");
        } else {
            System.out.println("Calculator sunstrack test : Error!");
        }

        System.out.println(result3);
    }
}

