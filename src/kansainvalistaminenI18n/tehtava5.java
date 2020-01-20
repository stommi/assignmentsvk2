package kansainvalistaminenI18n;

import java.text.Collator;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.Locale;

public class tehtava5 {
    public static void main(String[] args) {
        double eka = 3.1459;
        double toka = -1234.5;

        System.out.println(eka);
        System.out.println(toka);

        Locale suomi = new Locale("fi", "FI");
        Locale uk = new Locale("en", "GB");

        //2 desimaalilla
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(eka));

        //desimaali maittain , tähän voi muuttaa maan, tai kustomoida muodon
        System.out.format(Locale.ENGLISH, "%-10.4f%n%n", eka);


        //valuutta suomi
        NumberFormat muotoilija = NumberFormat.getCurrencyInstance(suomi);
        String tulos = "Suomi: " + muotoilija.format(eka);
        System.out.println(tulos);
        String tulos2 ="Suomi: " + muotoilija.format(toka);
        System.out.println(tulos2);

        //valuutta uk
        NumberFormat muotoilija2 = NumberFormat.getCurrencyInstance(uk);
        String tulos3 = "UK: " + muotoilija2.format(eka);
        System.out.println(tulos3);
        String tulos4 ="UK: " + muotoilija2.format(toka);
        System.out.println(tulos4);



    }
}
