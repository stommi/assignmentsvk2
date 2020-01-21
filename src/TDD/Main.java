package TDD;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Henkilo h = new Henkilo();
        Laskin l = new Laskin();

        h.setSyntymapaiva(LocalDate.of(1980, 2, 16));

        System.out.println(h.getSyntymapaiva());

        System.out.println(l.jaa(125, 10));
        System.out.println(l.kerro(0, 10));




    }




}
