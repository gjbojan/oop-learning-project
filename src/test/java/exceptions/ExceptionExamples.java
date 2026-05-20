package exceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ExceptionExamples {
    @Test (expected = NullPointerException.class)
    public void nullPointerException() {
        Integer age = null;
        String ageAsString;
        ageAsString = age.toString();
        assertEquals("0", ageAsString);
        assertNotNull(ageAsString);
        System.out.println(ageAsString);
    }

    @Test
    public void nullPointerExceptionHandled() {
        Integer age = null;
        String ageAsString;

        try {
            System.out.println("We are in a try block");
            ageAsString=age.toString();
        } catch (NullPointerException e) {
            System.out.println("We are in a catch block");
            System.out.println("Exception message" + e.getMessage());

            age = 0;
            ageAsString=age.toString();
        }
        assertNotNull(ageAsString);
        System.out.println(ageAsString);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void outOfBoundsException() {
        String[] daysOfTheWeek = {"Monday", "Tuesday"};
        System.out.println(daysOfTheWeek[3]);
        assertEquals("Tuesday", 3);
    }

    @Test
    public void outOfBoundsExceptionHandled() {
        String[] daysOfTheWeek = {"Monday", "Tuesday"};

        try {
            System.out.println("We are in a try block");
            System.out.println(daysOfTheWeek[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("We are in a catch block");
            System.out.println(daysOfTheWeek[daysOfTheWeek.length-1]);
        }
        assertEquals("Tuesday", daysOfTheWeek[1]);
    }
}
