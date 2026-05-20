package oopprinciples;

import electronicdevices.Laptop;
import electronicdevices.Smartphone;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectronicDeviceTest {
    Smartphone smartphone1 = new Smartphone("Samsung", "S23 Ultra", "Black", "$", 899.99, 2);
    Smartphone smartphone2 = new Smartphone();

    Laptop laptop1 = new Laptop("Lenovo", "IdeaPad", "Gray", "$", 500, true, false);
    Laptop laptop2 = new Laptop();

    @Test
    public void smartphoneTest() {
        assertEquals("Samsung", smartphone1.getBrand());
        assertEquals("S23 Ultra", smartphone1.getModel());
        assertEquals("Black", smartphone1.getColor());
        assertEquals(899.99, smartphone1.getPrice(), 0.0001);
        assertEquals("$", smartphone1.getCurrency());
        assertEquals("899.99 $", smartphone1.getFullPrice());
        assertEquals(2, smartphone1.getNumOfSimCards());

        assertEquals("The smartphone device Samsung S23 Ultra is unlocked.", smartphone1.printUnlockingDevice());
        System.out.println(smartphone1.printUnlockingDevice());

        smartphone2.setBrand("Iphone");
        smartphone2.setModel("17 Pro Max");
        smartphone2.setColor("Orange");
        smartphone2.setPrice(1300);
        smartphone2.setCurrency("$");
        smartphone2.setNumOfSimCards(1);

        assertEquals("Iphone", smartphone2.getBrand());
        assertEquals("17 Pro Max", smartphone2.getModel());
        assertEquals("Orange", smartphone2.getColor());
        assertEquals(1300, smartphone2.getPrice(), 0.0001);
        assertEquals("$", smartphone2.getCurrency());
        assertEquals("1300.0 $", smartphone2.getFullPrice());
        assertEquals(1, smartphone2.getNumOfSimCards());

        assertEquals("The smartphone device Iphone 17 Pro Max is unlocked.", smartphone2.printUnlockingDevice());
        System.out.println(smartphone2.printUnlockingDevice());
    }

    @Test
    public void laptopTest() {
        assertEquals("Lenovo", laptop1.getBrand());
        assertEquals("IdeaPad", laptop1.getModel());
        assertEquals("Gray", laptop1.getColor());
        assertEquals(500, laptop1.getPrice(), 0.0001);
        assertEquals("$", laptop1.getCurrency());
        assertEquals("500.0 $", laptop1.getFullPrice());
        assertTrue(laptop1.getHasCDRom());
        assertFalse(laptop1.getHasNumpad());

        assertEquals("The laptop device Lenovo IdeaPad is unlocked.", laptop1.printUnlockingDevice());
        System.out.println(laptop1.printUnlockingDevice());

        laptop2.setBrand("Macbook");
        laptop2.setModel("Pro M5");
        laptop2.setColor("Gray");
        laptop2.setPrice(4975.67);
        laptop2.setCurrency("$");
        laptop2.setHasCDRom(false);
        laptop2.setHasNumpad(false);

        assertEquals("Macbook", laptop2.getBrand());
        assertEquals("Pro M5", laptop2.getModel());
        assertEquals("Gray", laptop2.getColor());
        assertEquals(4975.67, laptop2.getPrice(), 0.0001);
        assertEquals("$", laptop2.getCurrency());
        assertEquals("4975.67 $", laptop2.getFullPrice());
        assertFalse(laptop2.getHasCDRom());
        assertFalse(laptop2.getHasNumpad());

        assertEquals("The laptop device Macbook Pro M5 is unlocked.", laptop2.printUnlockingDevice());
        System.out.println(laptop2.printUnlockingDevice());
    }
}
