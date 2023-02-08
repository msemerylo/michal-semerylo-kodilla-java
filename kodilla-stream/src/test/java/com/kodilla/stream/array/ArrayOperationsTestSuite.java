package com.kodilla.stream.array;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //given
        int numbers[] = {4,6,7,0,8,2,3,5,1,2,3,6,0,9,8,0};
        double averageExpected = 4.0;
        //when
        double average = ArrayOperations.getAverage(numbers);
        //then
        assertEquals(averageExpected,average);
    }
}
