package operatorsandstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperatorsAndStrings {
    //moze da se cuva sporedba vo boolean boolMethod() return metoda i da se povika

    int x = 10; // "=" vo ovaj slucaj e Assignment operator - dava vrednost na varijablata x

    @Test
    public void assignmentOperatorsTest() {
        int broj = 10;
        broj+=5; //brojot kje se zgolemi za 5, fakticki isto sto i broj = broj + 5
        System.out.println(broj);

        broj-=5; //prvo brojot go zgolemivme za 5, potoga go namaluvame za 5 i toa kje e 10
        System.out.println(broj);

        broj*=5; //go mnozime prethodno namaleniot broj so 5
        System.out.println(broj);

        broj/=5; //i pomnozeniot broj go delime so 5 i go dobivame 10 nazad
        System.out.println(broj);

        assertEquals(10, broj); /*testot pominuva poradi toa sto brojot sto sme go dobile na kraj e 10
                                           dokolku ne go ima delot so delenje testot kje padne*/
    }

    @Test
    public void arithmeticOperatorsTest() {
        int a = 10;
        int b = 5;

        assertEquals(15, a+b);
        assertEquals(5, a-b);
        assertEquals(50, a*b);
        assertEquals(2, a/b);

        for(int i=1;i<=10;i++) {
            System.out.println("Zgolemenuvanje na broj od 1 do 10: " + i);
        }

        for(int i=10;i>=1;i--) {
            System.out.println("Namaluvanje na broj od 10 do 1: " + i);
        }
    }

    @Test
    public void comparisonOperators() {
        int br1=10;
        int br2=10;
        int br3=20;

        assertTrue(br1==br2); //true ako dvata se ednakvi
        assertFalse(br1==br3); //false ako dvata ne se ednakvi
        assertTrue(br1!=br3); //true ako se razlicni
        assertFalse(br3<br1); //false ako br3 e pogolem od br1
        assertTrue(br1<br3); //true ako br1 e pomal od br3
        assertTrue(br1>=br2); //true ako br1 e pogolem ili ednakov od br2
        assertFalse(br3<=br2); //false ako br3 e pogolem ili ednakov na br1 sto ne e

        if(br1==br2 && br1!=br3) {
            System.out.println("True (Both statements are right)");
        }
        if(br1==br2 || br1>br3) {
            System.out.println("At least one of the statements are right");
        }
    }

    @Test
    public void stringTest() {
        String akademija = "Creative Hub Akademija";
        String akademijaGolemi = "CREATIVE HUB";
        String akademijaMali = "creative hub";
        String part1 = "Creative";
        String part2 = "Hub";

        assertEquals(22, akademija.length());
        System.out.println(akademijaGolemi.toLowerCase());
        assertEquals("creative hub", akademijaGolemi.toLowerCase());
        System.out.println(akademijaMali.toUpperCase());
        assertEquals("CREATIVE HUB", akademijaMali.toUpperCase());

        assertEquals(3,akademija.indexOf('a'));
        assertEquals('a', akademija.charAt(15));
        System.out.println(akademijaGolemi.equalsIgnoreCase(akademijaMali));
        assertTrue(akademijaGolemi.equalsIgnoreCase(akademijaMali));
        System.out.println(akademijaMali.equals(akademijaGolemi));
        assertFalse(akademijaMali.equals(akademijaGolemi));
        System.out.println(part1 + " " + part2);
    }

    boolean boolMethod() {
        return 10==10;
    }
    @Test
    public void booleanTest() {
        System.out.println("bool method value -> " + boolMethod());
        assertTrue(boolMethod());
    }
    @Test
    public void swapNumbers() {
        int a = 10;
        int b = 20;
        int temp;

        System.out.println(a + " " + b);

        temp=a;
        a=b;
        b=temp;

        System.out.println(a + " " + b);
    }

    @Test
    public void swapNumbersTest() {
        swapNumbers();
    }

    public String dvaParametri(int x, int y) {
        return x + " " + y;
    }

    public String dvaParametriZamena(int x, int y) {

        int temp;
        temp=x;
        x=y;
        y=temp;
        return x + " " + y;
        
    }

    @Test
    public void dvaParametriZamenaTest() {
        System.out.println(dvaParametri(10,20) + " " + dvaParametriZamena(10,20));
        assertEquals("10 20 20 10", dvaParametri(10,20) + " " + dvaParametriZamena(10, 20));


    }
}
