package variablesandmethods;

import org.junit.Test;

public class VariablesAndMethods {
    int Test = 10;

    //komentar vo edna linija

     /* komentar koj kje bide vo povekje linii

      */


    float testFloat = 3.14f;
    double testDouble = 3.14;

    @Test
    public void test1() {
        System.out.println(Test);
    }

    @Test
    public void test2() {
        System.out.println(testFloat);
    }
}
// 3 methodi i 3 testa za sobiranje, delenje, mnozenje i delenje BONUS kreireaj metod so povekje od 2 parametri i kreiraj test za nego