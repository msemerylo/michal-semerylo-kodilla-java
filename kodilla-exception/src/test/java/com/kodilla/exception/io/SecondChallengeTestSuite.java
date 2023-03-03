package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {
    @Test
    void testProbablyWillThrowExceprion(){
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertAll(
                ()->assertThrows(Exception.class, ()->secondChallenge.probablyIWillThrowException(2.01,1.51)),
                ()->assertThrows(Exception.class, ()->secondChallenge.probablyIWillThrowException(0.99,1.5)),
                ()->assertDoesNotThrow(()->secondChallenge.probablyIWillThrowException(1.5,2.5))
                );

    }
}
