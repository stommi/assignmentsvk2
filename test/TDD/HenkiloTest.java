package TDD;

import org.junit.Test;

import static org.junit.Assert.*;

public class HenkiloTest {
    @Test
    public void testaaHenkilonLuonti(){
        Henkilo h = new Henkilo();
        assertNotNull("Henkilön luonti onnistuu", h);
    }

    @Test
    public void testaaHenkilonNimenAsetus(){
        String odotettuNimi = "Jaska";
        Henkilo h = new Henkilo();
        h.setEtunimi("Jaska");
        String saatuNimi = h.getEtunimi();
        assertEquals(odotettuNimi, saatuNimi);
    }

}