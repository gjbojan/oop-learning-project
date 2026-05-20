package selectiondecisionrepetitionarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DomasnaZadacaArrays2 {

    //SUM of 4th, 5th, 6th Element in the Array
    int sumArray(int[] membersOfArray) {
        return membersOfArray[3] + membersOfArray[4] + membersOfArray[5];
    }

    @Test
    public void sumArrayTest() {
        int[] arrayDeclaration = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(15, sumArray(arrayDeclaration));
    }

    //Print the even numbers from an array
    public void evenNumbersArray() {
        int[] membersOfArray = {5, 7, 4, 10, 23, 22};
        System.out.print("\n");
        for (int i = 0; i < membersOfArray.length; i++) {
            if (membersOfArray[i] % 2 == 0) {
                System.out.print(membersOfArray[i] + " ");
            }
        }
    }

    @Test
    public void evenNumbersArrayTest() {
        evenNumbersArray();
    }

    //Multiplication Table for 7
    public void operationTable() {
        int[] membersOfArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < membersOfArray.length; i++) {
            System.out.print(membersOfArray[i] * 7 + " ");
        }
    }

    @Test
    public void operationTableTest() {
        operationTable();
    }

    //Repeated Number in an Array
    int repetitiveElement(int[] membersOfArray) {
        int repetitive = 0;
        for (int i=0; i<membersOfArray.length; i++) {
            for (int j = i + 1; j < membersOfArray.length; j++) {
                if (membersOfArray[i] == membersOfArray[j]) {
                    repetitive = membersOfArray[i];
                }
            }
        }
        return repetitive;
    }

    @Test
    public void repetitiveElementTest() {
        int[] arrayDeclaration = {2,5,6,4,1,12,5};
        assertEquals(5, repetitiveElement(arrayDeclaration));
    }

    //Count Vowels in a string
    int countVowels(String sentence) {
        int counter=0;
        for(int i=0;i<sentence.length();i++) {
            sentence = sentence.toLowerCase();
            if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'o' || (sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i')|| sentence.charAt(i) == 'u' ) {
                counter++;
            }
        }
        return counter;
    }

    @Test
    public void countVowelsTest() {
        assertEquals(2, countVowels("Bojan"));
        assertEquals(9, countVowels("Ova e domasna zadaca!"));
    }
}



