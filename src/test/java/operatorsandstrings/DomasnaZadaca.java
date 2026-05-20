package operatorsandstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class DomasnaZadaca {
    boolean dveEdnakvi(int x, int y) {
        return x==y;
    }
    @Test
    public void dveEdnakviTest() {
        assertTrue(dveEdnakvi(10,10));
        assertFalse(dveEdnakvi(10,9));
    }

    boolean prvaPogolema(int x, int y) {
        return x>y;
    }
    @Test
    public void prvaPogolemaTest() {
        assertTrue(prvaPogolema(10,5));
        assertFalse(prvaPogolema(5,10));
    }
    boolean prvaPomala(int x, int y) {
        return x<y;
    }
    @Test
    public void prvaPomalaTest() {
        assertTrue(prvaPomala(5,10));
        assertFalse(prvaPomala(10,5));
    }
    String akademijaParametri(String part1, String part2) {
        String finalen = part1 + " " + part2;
        finalen = finalen.toUpperCase();
        return finalen;
    }
    @Test
    public void akademijaParametriTest() {
        assertEquals("CREATIVE HUB", akademijaParametri("CreaTiVe", "huB"));
        assertEquals("creative hub", akademijaParametri("CreaTiVe", "huB").toLowerCase());
    }


}
