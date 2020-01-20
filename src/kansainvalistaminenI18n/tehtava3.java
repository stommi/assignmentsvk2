package kansainvalistaminenI18n;

import java.text.Collator;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class tehtava3 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        Locale suomi = new Locale("FI");
        Locale suomenruotsi = new Locale("sv","FI");
        Locale englanti = new Locale("en","GB");

        System.out.println("Suomeksi");
        ResourceBundle suomeksi = ResourceBundle.getBundle("resurssinippu", suomi);
        System.out.println(suomeksi.getString("cat"));
        System.out.println(suomeksi.getString("dog"));

        System.out.println("Suomenruotsiksi");
        ResourceBundle suomenruotsiksi = ResourceBundle.getBundle("resurssinippu", suomenruotsi);
        System.out.println(suomenruotsiksi.getString("cat"));

        System.out.println("Englanniksi");
        ResourceBundle englanniksi = ResourceBundle.getBundle("resurssinippu", englanti);
        System.out.println(englanniksi.getString("cat"));





    }

    private static void tulosta(String sana, Locale loc) {
        Collator kollaattori = Collator.getInstance(loc);
        System.out.println(loc.getDisplayName(new Locale("fi", "FI")));
        System.out.println("\t" + sana);
    }
}
