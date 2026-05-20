package oopprinciples;

import inhabitatplace.City;
import inhabitatplace.Village;
import org.junit.Test;

import static org.junit.Assert.*;

public class InhabitatPlaceTest {
    City city1 = new City("Skopje", 526502, "Orce", true, 30 );
    City city2 = new City();

    Village village1 = new Village("Banjani", 527, "Zoran", true);
    Village village2 = new Village();

    @Test
    public void cityTest() {
        assertEquals("Skopje", city1.getName());
        assertEquals(526502, city1.getPopulation());
        assertEquals("Orce", city1.getMajor());
        assertTrue(city1.getIsCapitalCity());
        assertEquals(30, city1.getNumberOfBoulevars());

        assertEquals("Citizens from Skopje mostly drink factory milk", city1.drinkMilk());

        city2.setName("Ohrid");
        city2.setPopulation(38818);
        city2.setMajor("Kiril");
        city2.setIsCapitalCity(false);
        city2.setNumberOfBoulevars(2);

        assertEquals("Ohrid", city2.getName());
        assertEquals(38818, city2.getPopulation());
        assertEquals("Kiril", city2.getMajor());
        assertFalse(city2.getIsCapitalCity());
        assertEquals(2, city2.getNumberOfBoulevars());

        assertEquals("Citizens from Ohrid mostly drink factory milk", city2.drinkMilk());


    }

    @Test
    public void villageTest() {
        assertEquals("Banjani", village1.getName());
        assertEquals(527, village1.getPopulation());
        assertEquals("Zoran", village1.getMajor());
        assertTrue(village1.getHasTradition());

        assertEquals("Citizens from Banjani drink homemade milk", village1.drinkMilk());

        village2.setName("Gornjane");
        village2.setPopulation(80);
        village2.setMajor("Zoran");
        village2.setHasTradition(true);

        assertEquals("Gornjane", village2.getName());
        assertEquals(80, village2.getPopulation());
        assertEquals("Zoran", village2.getMajor());
        assertTrue(village2.getHasTradition());

        assertEquals("Citizens from Gornjane drink homemade milk", village2.drinkMilk());
    }
}
