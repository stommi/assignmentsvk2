package TDD;

import org.junit.Test;

import static org.junit.Assert.*;

public class LaskinTest {

    private Laskin l = new Laskin();

    @Test
    public void laskinOlionLuontiOnnistuu(){
        assertNotNull(l);
    }

    @Test
    public void tarkastetaanEttaPlusLaskuMetodiToimiiOikein() {
        int x = 1;
        int y = 1;
        int summa = l.plussaa(x, y);
        assertEquals("Pluslaskun pitäisi palauttaa muuttujien summa", 2, summa);

        int k = 2;
        int j = 3;
        int sum = l.plussaa(k,j);
        assertEquals("Pluslaskun pitäisi palauttaa muuttujien summa", 5, sum);

    }

    @Test
    public void testaaEttaPlusLaskuToimiiOikeinRiippumattaSiitaMissaJarjestyksessaParametritSyotetaan() {

        int x = 1;
        int y = 4;

        int summa = l.plussaa(x, y);

        assertEquals("Pluslaskun pitäisi palauttaa muuttujien summa", 5, summa);

        int sum = l.plussaa(y, x);
        assertEquals("Pluslaskun pitäisi palauttaa muuttujien summa", 5, sum);
    }

    @Test
    public void testaaEttaVahennysLaskuToimii() {
        int x = 9;
        int y = 6;

        int erotus = l.miinusta(x,y);

        assertEquals("Vähennyslaskun pitäisi palauttaa lukujen erotus", 3, erotus);
    }

    @Test
    public void testaaEttaKertolaskuToimii() {
        int x = 5;
        int y = 2;

        int tulos = l.kerro(x, y);

        assertEquals("Kertolaskun pitäisi paluttaa lukujen tulo", 10, tulos);
    }

    @Test
    public void testaaEttaJakolaskuToimii() {
        int jaettava = 100;
        int jakaja = 5;

        double tulos = l.jaa(jaettava,jakaja);

        assertEquals("Jakolaskun pitäisi palauttaa ensimmainen luku jaettuna toisella luvulla", 20.0, tulos, 0);
    }

    @Test
    public void jakoLaskuToimiiOikein(){
        assertEquals(Double.POSITIVE_INFINITY,l.jaa(5,0),0);
    }

}