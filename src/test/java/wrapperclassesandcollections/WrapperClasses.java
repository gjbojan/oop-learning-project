package wrapperclassesandcollections;

import org.junit.Test;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WrapperClasses {

    @Test
    public void wrapperClassesObjects() {
        int x = 10; // obicna deklaracija
        Integer xAsObject = 10; // objekt od tip integer toest wrapper klasa
        int intVar1 = 10;
        Integer intAsObject = 10;
        Integer yAsObject = 20;

        char charVar = 'a';

        Long longAsObject;
        Short shortAsObject;
        Byte byteAsObject;
        Double doubleAsObject;
        Float floatAsObject;
        Character charAsObject = 'a';
        Boolean boolAsObject;

        String academy = "Creative Hub";
        String num1 = "10";
        String num2 = "20";

        assertEquals('e', academy.charAt(2));

        System.out.println(num1 + num2);
        System.out.println(parseInt(num1) + parseInt(num2));

        assertEquals("1020", num1 + num2);
        assertEquals(30, parseInt(num1) + parseInt(num2));

        assertTrue(x == intVar1);
        System.out.println("Comparison of 2 integer objects: " + xAsObject.compareTo(intAsObject));
        System.out.println("Comparison of 2 integer objects: " + xAsObject.compareTo(yAsObject));
        System.out.println("Comparison of 2 integer objects: " + yAsObject.compareTo(xAsObject));
        assertEquals(-1, xAsObject.compareTo(yAsObject));

    }

}
