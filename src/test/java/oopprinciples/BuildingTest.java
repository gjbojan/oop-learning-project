package oopprinciples;

import buildings.Apartment;
import buildings.House;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuildingTest {
    Apartment apartment1 = new Apartment(72.0, 3, 2, true, 5);
    Apartment apartment2 = new Apartment();

    House house1 = new House(250.0, 6, 2, true, 300.0);
    House house2 = new House();

    @Test
    public void apartmentTest() {
        assertEquals(72.0, apartment1.getSquareMeters(),0.0001);
        assertEquals(3, apartment1.getNumberOfRooms());
        assertEquals(2, apartment1.getNumberOfTerraces());
        assertTrue(apartment1.getHasAlarms());
        assertEquals(5, apartment1.getFloor());

        assertEquals("Building process time of the apartment is estimated to be around 1 and a half years.", apartment1.buildingTime());
        System.out.println(apartment1.buildingTime());

        apartment2.setSquareMeters(180.0);
        apartment2.setNumberOfRooms(5);
        apartment2.setNumberOfTerraces(3);
        apartment2.setHasAlarms(true);
        apartment2.setFloor(10);

        assertEquals(180.0, apartment2.getSquareMeters(),0.0001);
        assertEquals(5, apartment2.getNumberOfRooms());
        assertEquals(3, apartment2.getNumberOfTerraces());
        assertTrue(apartment2.getHasAlarms());
        assertEquals(10, apartment2.getFloor());

        assertEquals("Building process time of the apartment is estimated to be around 1 and a half years.", apartment2.buildingTime());
        System.out.println(apartment2.buildingTime());
    }

    @Test
    public void houseTest() {
        assertEquals(250.0, house1.getSquareMeters(),0.0001);
        assertEquals(6, house1.getNumberOfRooms());
        assertEquals(2, house1.getNumberOfTerraces());
        assertTrue(house1.getHasAlarms());
        assertEquals(300.0, house1.getYardSquareMeters(),0.0001);

        assertEquals("Building process time of the house is estimated to be around 8 months.", house1.buildingTime());
        System.out.println(house1.buildingTime());

        house2.setSquareMeters(80.0);
        house2.setNumberOfRooms(3);
        house2.setNumberOfTerraces(1);
        house2.setHasAlarms(false);
        house2.setYardSquareMeters(50.0);

        assertEquals(80.0, house2.getSquareMeters(),0.0001);
        assertEquals(3, house2.getNumberOfRooms());
        assertEquals(1, house2.getNumberOfTerraces());
        assertFalse(house2.getHasAlarms());
        assertEquals(50.0, house2.getYardSquareMeters(),0.0001);

        assertEquals("Building process time of the house is estimated to be around 8 months.", house2.buildingTime());
        System.out.println(house2.buildingTime());
    }
}
