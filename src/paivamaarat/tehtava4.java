package paivamaarat;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class tehtava4 {
    public static void main(String[] args) {
        LocalDate tanaan = LocalDate.now();
        LocalDate syntymaP = LocalDate.of(1991, 7, 16);
        LocalDate seuraavaSyntP = LocalDate.of(2020, 7, 16);

        //ika
        Period erotus = Period.between(tanaan, syntymaP);
        System.out.println(erotus);

        //aikaa seuraavaan syntP
        System.out.println(Period.between(tanaan, seuraavaSyntP));

        //kuinka kauan paivaa jaljella
        //Duration.

        //syntynyt viikonpaivana
        System.out.println(syntymaP.getDayOfWeek());





    }
}
