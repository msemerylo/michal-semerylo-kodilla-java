package com.kodilla.stream.sand;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SandStorageTestSuite {
    @Test
    void testGetSandBeansQuantity(){
        //given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Africa());
        continents.add(new Asia());
        //when
        BigDecimal totalSand = BigDecimal.ZERO;
        for (SandStorage continent:continents){
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }
        //then
        BigDecimal expectedSand = new BigDecimal("122222222102592592569");
        assertEquals(expectedSand, totalSand);
    }
    @Test
    void testGetSandBeansQuantityWithReduce(){
        //given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());
        //when
        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigDecimal.ZERO,(sum, current)->sum=sum.add(current));
        //then
        BigDecimal expectedSand = new BigDecimal("122222222102592592569");
        assertEquals(expectedSand, totalSand);
    }
}
