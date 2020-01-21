package TDD;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Henkilo h = new Henkilo();
        Laskin l = new Laskin();

        h.setSyntymapaiva(LocalDate.of(1980, 2, 16));

        try {
            System.out.println(l.jaa(15, 0));
        } catch (ArithmeticException e) {
            System.err.println("Nollalla ei voi jakaa: " + e.getMessage());
        }



    }




}
