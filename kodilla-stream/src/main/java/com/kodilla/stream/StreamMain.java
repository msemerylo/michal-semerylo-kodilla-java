package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.interate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args){
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5,(a,b)->a+b);
        expressionExecutor.executeExpression(10,5,(a,b)->a-b);
        expressionExecutor.executeExpression(10,5,(a,b)->a*b);
        expressionExecutor.executeExpression(10,5,(a,b)->a/b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String newBeutifullText = poemBeautifier.beautify("Text 1", (text -> "ABC " + text + " ABC"));
        System.out.println(newBeutifullText);
        String newBeutifullText2 = poemBeautifier.beautify("Text 2", (text -> text.toUpperCase()));
        System.out.println(newBeutifullText2);
        String newBeutifullText3 = poemBeautifier.beautify("TEXT THREE", (text -> text.toLowerCase()));
        System.out.println(newBeutifullText3);
        String newBeutifullText4 = poemBeautifier.beautify("Text 4", (text -> text +" "+ newBeutifullText +" "+ newBeutifullText2 +" "+ newBeutifullText3));
        System.out.println(newBeutifullText4);


        System.out.println("Using Stream to genarate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }

}
