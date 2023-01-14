package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> number = new ArrayList<Integer>();
        Random random = new Random();
        for (int i=0; i>0; i++) {
            if (i % 2 ==0) {
                number.add(random.nextInt(50));
            }
        }


        return number;


    }
}

