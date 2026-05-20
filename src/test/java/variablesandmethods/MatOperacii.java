package variablesandmethods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatOperacii {

    int odzemanjeDvaParametri(int x, int y) {
        return x-y;
    }

//    @Test
//    public void odzemanjeDvaParametritest() {
//        System.out.println(odzemanjeDvaParametri(10,20));
//    }

    @Test
    public void odzemanjeDvaParametritest2() {
        assertEquals(-10, odzemanjeDvaParametri(10,20));
    }

    int mnozenjeDvaParametri(int x, int y) {
        return x*y;
    }

//    @Test
//    public void mnozenjeDvaParametritest() {
//        System.out.println(mnozenjeDvaParametri(10,20));
//    }

    @Test
    public void mnozenjeDvaParametritest2() {
        assertEquals(200, mnozenjeDvaParametri(10,20));
    }

    double delenjeDvaParametri(double x, double y) {
        return x/y;
    }

//    @Test
//    public void delenjeDvaParametritest() {
//        System.out.println(delenjeDvaParametri(10,20));
//    }

    @Test
    public void delenjeDvaParametritest2() {
        assertEquals(0.5, delenjeDvaParametri(10,20), 0.0001);
    }

    int operaciiTriParametri(int x, int y, int z) {
        return (x+y)*z;
    }

//    @Test
//    public void operaciiTriParametritest() {
//        System.out.println(operaciiTriParametri(10,20,5));
//    }

    @Test
    public void operaciiTriParametritest2() {
        assertEquals(150,operaciiTriParametri(10,20,5));
    }

//    @Test
//    public void mixtest() {
//        System.out.println(operaciiTriParametri(10,20, 5) - mnozenjeDvaParametri(10,20));
//    }

    @Test
    public void mixtest2() {
        assertEquals(-50,operaciiTriParametri(10,20,5) - mnozenjeDvaParametri(10,20));
    }

//    @Test
//    public void alltogethertest() {
//        System.out.println(odzemanjeDvaParametri(10,20));
//        System.out.println(mnozenjeDvaParametri(10,20));
//        System.out.println(delenjeDvaParametri(10,20));
//        System.out.println(operaciiTriParametri(10,20,5));
//        System.out.println(operaciiTriParametri(10,20, 5) - mnozenjeDvaParametri(10,20));
//        System.out.println();
//    }
}





