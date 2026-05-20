package wrapperclassesandcollections;

import org.junit.Test;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertEquals;

public class DomasnaZadacaWrapperAndCollections {

    //TASK 1 - Get the 5th character from a String
    int getCharacter(String randomString) {
        return randomString.charAt(4);
    }

    @Test
    public void getCharacterTest() {
        assertEquals('n', getCharacter("Bojan"));
        assertEquals('n', getCharacter("Bojana"));
    }

    //TASK 2 - Convert String to Integer and get its number
    @Test
    public void convertStringToInt() {
        String broj1 = "5";
        String broj2 = "10";

        int br1Int = parseInt(broj1);
        int br2Int = parseInt(broj2);

        assertEquals(5, br1Int);
        assertEquals(10, br2Int);
    }

    //TASK 3 - Count empty spaces in a String
    int countEmptySpaces(String randomString) {
        int counter=0;
        for(int i=0;i<randomString.length();i++) {
            if(randomString.charAt(i) == ' ') {
                counter++;
            }
        }
        return counter;
    }

    @Test
    public void countEmptySpacesTest() {
        assertEquals(4, countEmptySpaces("Creative Hub Software Testing Academy"));
    }

    //TASK 4 - Count how many "TRUE" values exist in 3 different Strings
    int countTrueString(String value1, String value2, String value3) {
        int counter=0;
        ArrayList<String> values = new ArrayList<>();
        values.add(value1);
        values.add(value2);
        values.add(value3);

        for(int i=0;i<values.size();i++) {
            if(Boolean.valueOf(values.get(i)) == true) {
                counter++;
            }
        }
        return counter;
    }

    @Test
    public void countTrueStringTest() {
        assertEquals(1, countTrueString("true", "truee", "mtrue"));
    }

    //TASK 5 - Delete even numbers and return the list
    ArrayList<Integer> deleteEvenNumbers(int br1, int br2, int br3, int br4, int br5) {
        ArrayList<Integer> broevi = new ArrayList<>();
        broevi.add(br1); broevi.add(br2); broevi.add(br3); broevi.add(br4); broevi.add(br5);

        for(int i=broevi.size()-1; i>=0; i--) {
            if(broevi.get(i) % 2 == 0) {
                broevi.remove(i);
            }
        }
        return broevi;
    }

    @Test
    public void deleteEvenNumbersTest() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(5);

        assertEquals(expected, deleteEvenNumbers(1,2,3,4,5));

        ArrayList<Integer> expected2 = new ArrayList<>();
        expected2.add(3);

        assertEquals(expected2, deleteEvenNumbers(2,4,3,6,8));
    }
}
