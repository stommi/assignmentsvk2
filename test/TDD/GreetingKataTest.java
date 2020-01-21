package TDD;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingKataTest {

    @Test
    public void testaaOlionLuonti() {
        GreetingKata testi = new GreetingKata();
        assertNotNull("Olion luonti onnistuu", testi);
    }

    @Test
    public void testaaEttaTervehdiMetodiTervehtiiSyotteella(){
        GreetingKata testi = new GreetingKata();
        String saatuTuloste = testi.greet("Jaska");
        String odotettuTuloste = "Hello, Jaska.";
        assertEquals(odotettuTuloste, saatuTuloste);
    }

    @Test
    public void testaaEttaMetodiKorvaaNimenMyFriendSyotteellaJosNimiNull() {
        GreetingKata testi = new GreetingKata();
        String saatuTuloste = testi.greet(null);
        String odotettuTuloste = "Hello, my friend.";
        assertEquals(odotettuTuloste, saatuTuloste);
    }

    @Test
    public void testaaEttaJosNimiOnKirjoitettuIsollaNiinMetoriTervehtiiIsolla() {
        GreetingKata testi = new GreetingKata();
        String saatuTuloste = testi.greet("JASKA");
        String odotettutTuloste = "HELLO, JASKA.";
        assertEquals(odotettutTuloste, saatuTuloste);
    }

    @Test
    public void testaaEttaJosKaksiNimeaNiinMetodiTulostaaNimiJaNimi() {
        GreetingKata testi = new GreetingKata();
        String saatuTuloste = testi.greet("Jaska,Jorma");
        String odotettuTuloste = "Hello, Jaska and Jorma.";
        assertEquals(odotettuTuloste, saatuTuloste);
    }

    @Test
    public void testaaEttaJosNimiaOnUseempiTulostaaNimiJaNimiJne() {
        GreetingKata testi = new GreetingKata();
        String saatuTuloste = testi.greet("Jaska,Jorma,Liisa");
        String odotettuTuloste = "Hello, Jaska, Jorma and Liisa.";
        assertEquals(odotettuTuloste, saatuTuloste);
    }

}