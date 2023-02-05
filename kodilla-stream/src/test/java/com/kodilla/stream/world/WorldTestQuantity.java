package com.kodilla.stream.world;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestQuantity {
    @Test
    void testGetPeopleQuantity(){
        //given
        World world = new World();


        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        Country poland = new Country("Poland",new  BigDecimal("37750000"));
        Country norway = new Country("Norway",new BigDecimal("5408000"));
        Country spain = new Country("Spain",new BigDecimal("47420000"));

        Country china = new Country("China",new BigDecimal("1412000000"));
        Country india = new Country("India",new BigDecimal("1408000000"));
        Country southKorea = new Country("South Korea",new BigDecimal("51740000"));

        Country ghana = new Country("Ghana",new BigDecimal("32830000"));
        Country kenia = new Country("Kenia",new BigDecimal("53010000"));
        Country marocco = new Country("Marocco",new BigDecimal("37080000"));

        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        europe.addCountry(poland);
        europe.addCountry(norway);
        europe.addCountry(spain);

        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(southKorea);

        africa.addCountry(ghana);
        africa.addCountry(kenia);
        africa.addCountry(marocco);


        BigDecimal totalPeople = world.getPeopleQuantity();


        //then
        BigDecimal totalPeopleExpected = new BigDecimal("");
        assertEquals(totalPeopleExpected, totalPeople);


    }

}
