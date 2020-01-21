package TDD;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsKataTest {

    @Test
    public void testaaOlionLuonti() {
        RomanNumeralsKata testi = new RomanNumeralsKata();
        assertNotNull("Olion luonti onnistuu", testi);
    }

    @Test
    public void symboliIpaluttaaArvon1(){
        RomanNumeralsKata testi = new RomanNumeralsKata();
        testi.lisaa("I", 1);
        int odotettuTuloste = 1;
        int saatuTuloste = testi.hae("I");
        assertEquals(odotettuTuloste, saatuTuloste);
    }

}