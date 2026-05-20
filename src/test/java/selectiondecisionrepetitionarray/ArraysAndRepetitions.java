package selectiondecisionrepetitionarray;

import org.junit.Test;

import java.util.Arrays;

public class ArraysAndRepetitions {

    @Test
    public void arrays() {


        int[] arrayIntegers = new int[5]; //5 integera vo niza
        //za da vneseme vrednost se gleda nivnata pozicija koja pocnuva od 0
        arrayIntegers[0] = 1;
        arrayIntegers[1] = 2;
        arrayIntegers[2] = 3;
        arrayIntegers[3] = 4;
        arrayIntegers[4] = 5;

        int[] numbersForSorting = {5,2,1,4,3};
        char[] charsForSorting = {'c', 'b', 'a', 'e', 'd'};

        System.out.println("First number of the integer array: " + arrayIntegers[0]);

        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] daysOfTheWeekCopy;
        String[] workingDays;
        String[] weekend;
        String[] undefinedArray = new String[7];

        System.out.println("First day of the week: " + daysOfTheWeek[0]);

        //pocnuvame od 0 posto prviot clen od nizata e 0
        //sekogas koga ja povikuvame nizata vnesuvame i mesto clenot na nizata posto i stanuva toj clen od niza
        for(int i=0; i<5; i++ ) {
            System.out.println("For cycle: " + arrayIntegers[i]);
        }

        //copy array
        daysOfTheWeekCopy = Arrays.copyOf(daysOfTheWeek, 7);
        for(int i=0; i<daysOfTheWeekCopy.length; i++) {
            System.out.println("Copy of the days of the week array loop: " + daysOfTheWeekCopy[i]);
        }

        //copy of range
        workingDays = Arrays.copyOfRange(daysOfTheWeek, 0, 5);
        for(int i=0; i<workingDays.length; i++) {
            System.out.println("Working days loop: " + workingDays[i]);
        }

        weekend = Arrays.copyOfRange(daysOfTheWeek, 5,7);
        for(int i=0;i<weekend.length;i++) {
            System.out.println("Weekend days loop: " + weekend[i]);
        }

        //fill method
        Arrays.fill(undefinedArray, "ADD this value");

        for(int i=0;i<undefinedArray.length;i++) {
            System.out.println("Undefined array loop: " + undefinedArray[i]);
        }

        //sort method
        Arrays.sort(numbersForSorting);
        Arrays.sort(charsForSorting);

        for(int i=0;i<numbersForSorting.length;i++) {
            System.out.println("Sort numbers: " + numbersForSorting[i]);
        }

        for(int i=0;i<charsForSorting.length;i++) {
            System.out.println("Sort chars: " + charsForSorting[i]);
        }


    }
}
