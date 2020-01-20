package kansainvalistaminenI18n;

import java.text.Collator;
import java.util.*;

public class tehtava2 {
    public static void main(String[] args) {
        String sana = "vaari,pêche,persikka,väärä,auto,älämölö,Java";
        String [] sanoja = sana.split(",");
        List<String> sanat = Arrays.asList(sanoja);
        Locale suomi = new Locale("fi");
        Locale ruotsi = new Locale("swe");
        Locale englanti = new Locale("en");
        Locale ranska = new Locale("fr");

        for (int i = 0; i <sanoja.length ; i++) {
            System.out.println(sanoja[i]);
        }

        System.out.println("");

        for (String sana1: sanat) {
            System.out.println(sana1);

        }

        tulosta(sanat, suomi);
        tulosta(sanat, ruotsi);
        tulosta(sanat, englanti);
        tulosta(sanat, ranska);


    }

    private static void tulosta(List<String> sanat, Locale loc) {
        Collator kollaattori = Collator.getInstance(loc);
        Collections.sort(sanat, kollaattori::compare);
        System.out.println(loc.getDisplayName(new Locale("fi", "FI")));
        System.out.println("\t" + sanat);
    }
}
