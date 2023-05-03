package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;
    public double add(double a, double b) {
        double sum = a + b;
        display.displayValue(sum);
        return sum;
    }
    public double sub(double a, double b) {
        double dif = a - b;
        display.displayValue(dif);
        return dif;
    }
    public double mul(double a, double b) {
        double pro = a * b;
        display.displayValue(pro);
        return pro;
    }
    public double div(double a, double b) {
        double quo = a / b;
        display.displayValue(quo);
        return quo;
    }
}
