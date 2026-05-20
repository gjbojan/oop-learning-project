package selectiondecisionrepetitionarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DomasnaZadacaArrays {

    //TASK 3 - Return the third member of the array
    int arrayElements(int[] membersOfArray) {
        return membersOfArray[2];
    }

    @Test
    public void arrayElementsTest() {
        int[] arrayDeclaration = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(3, arrayElements(arrayDeclaration));

    }

    //TASK 4 - Return the member with the maximum value
    int maxArray(int[] maxElementOfArray) {
        int max = 0;
        for(int i=0;i<maxElementOfArray.length;i++) {

            if(max<maxElementOfArray[i]) {
                max=maxElementOfArray[i];
            }
        }
        return max;
    }

    // +BONUS TASK - Print the arrays in reverse order inside the test
    @Test
    public void maxArrayTest() {
        int[] arrayDeclaration = {3,5,8,4,6,12,9};
        assertEquals(12,maxArray(arrayDeclaration));

        System.out.print("Normal order: ");
        for(int i=0;i<arrayDeclaration.length;i++) {
            System.out.print(arrayDeclaration[i]+ " ");
        }

        System.out.print("\n");

        System.out.print("Reversed order: ");
        for(int i=arrayDeclaration.length-1; i>=0; i--) {
            System.out.print(arrayDeclaration[i] + " ");
        }

        System.out.print("\n");

        int[] arrayDeclaration2 = {1,2,3,4,5,6,7,8,9};

        System.out.print("Normal order: ");
        for(int i=0;i<arrayDeclaration2.length;i++) {
            System.out.print(arrayDeclaration2[i]+ " ");
        }

        System.out.print("\n");

        System.out.print("Reversed order: ");
        for(int i=arrayDeclaration2.length-1; i>=0 ;i--) {
            System.out.print(arrayDeclaration2[i] + " ");
        }

    }

    //TASK 5 - Return the name of the string with the most characters
    String stringArray(String[] randomstring) {
        int characters = 0;
        String najgolem = " ";
        for(int i=0;i<randomstring.length;i++) {
           if(characters<randomstring[i].length()) {
               characters=randomstring[i].length();
               najgolem=randomstring[i];
           }

        }
        return najgolem;
    }

    // +BONUS TASK - Print the array in reverse order inside the test
    @Test
    public void stringArrayTest() {
        String[] arrayDeclaration = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        assertEquals("Wednesday", stringArray(arrayDeclaration));


        System.out.print("\n");
        System.out.print("Normal order: ");
        for(int i=0;i<arrayDeclaration.length;i++) {
            System.out.print(arrayDeclaration[i] + " ");
        }

        System.out.print("\n");

        System.out.print("Reversed order: ");
        for(int i=arrayDeclaration.length-1; i>=0; i--) {
            System.out.print(arrayDeclaration[i] + " ");
        }
    }
}
