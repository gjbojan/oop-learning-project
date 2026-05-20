package selectiondecisionrepetitionarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VezbiNaCas {

    //TASK 1 - Pozitiven ILI Negativen
    String pozitivenNegativen(int br) {
        if(br>0) {
            return "pozitiven";
        }
        else if (br==0) {
            return "neutralen";
        }
        else {
            return "negativen";
        }
    }

    @Test
    public void pozitivenNegativenTest() {
        assertEquals("pozitiven", pozitivenNegativen(1));
        assertEquals("pozitiven", pozitivenNegativen(9999));
        assertEquals("negativen", pozitivenNegativen(-1));
        assertEquals("negativen", pozitivenNegativen(-9999));
        assertEquals("neutralen", pozitivenNegativen(0));
    }

    //TASK 2 - Moze da Glasa ILI ne
    String vozrastGlasanje(int vozrast) {
        if(vozrast>=18 && vozrast<=125) {
            return "Dozvoleno";
        }
        else if (vozrast>0 && vozrast <18){
            return "Nedozvoleno";
        }
        else {
            return "Nevalidno";
        }
    }
    @Test
    public void vozrastGlasanjeTest() {
        assertEquals("Dozvoleno", vozrastGlasanje(18));
        assertEquals("Dozvoleno", vozrastGlasanje(70));
        assertEquals("Dozvoleno", vozrastGlasanje(125));
        assertEquals("Nedozvoleno", vozrastGlasanje(17));
        assertEquals("Nedozvoleno", vozrastGlasanje(9));
        assertEquals("Nedozvoleno", vozrastGlasanje(1));
        assertEquals("Nevalidno", vozrastGlasanje(126));
        assertEquals("Nevalidno", vozrastGlasanje(0));
        assertEquals("Nevalidno", vozrastGlasanje(-1));
    }

    //TASK 3 - Vowel OR Consonant
    String vowelConsonant(char bukva) {
        if(Character.isLetter(bukva)) {
            bukva=Character.toLowerCase(bukva);
            if(bukva == 'a' || bukva == 'u' || bukva == 'o' || bukva == 'i' || bukva == 'e') {
                return "vowel"; //самогласка
            }
            else return "consonant"; //согласка
        }
        else
            return "error";
    }

    @Test
    public void vowelConsonantTest() {
        assertEquals("vowel", vowelConsonant('a')); //самогласка
        assertEquals("vowel", vowelConsonant('A')); //самогласка
        assertEquals("consonant", vowelConsonant('k')); //согласка
        assertEquals("error", vowelConsonant('%'));
        assertEquals("error", vowelConsonant('0'));
        assertEquals("consonant", vowelConsonant('K')); //согласка

    }

    //TASK 4 - Is The String Empty OR Not
    String emptyOrNot(String string) {
        if(string.isEmpty()) {
            return "empty";
        }
        else {
            return "not empty";
        }
    }

    @Test
    public void emptyOrNotTest() {
        assertEquals("empty", emptyOrNot(""));
        assertEquals("not empty", emptyOrNot("Bojan"));
        assertEquals("not empty", emptyOrNot("#####"));
        assertEquals("not empty", emptyOrNot(" "));
    }
}
