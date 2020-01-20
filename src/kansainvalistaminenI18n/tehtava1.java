package kansainvalistaminenI18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class tehtava1 {
    public static void main(String[] args) {
        //default oletuskielialue
        System.out.println(Locale.getDefault());

        //uusi locale
        Locale suomi = new Locale("fi");

        //oletus locale tulostettuna suomen kielellä
        System.out.println(Locale.getDefault().getDisplayName(suomi));

        System.out.println(suomi.getDisplayName());
        System.out.println(suomi.getDisplayName(suomi));

        //listaa koneeltasi löytyvät kielialuuet enkuksi
        for (Locale locale: Locale.getAvailableLocales()) {
            System.out.println(locale);
        }

        //listaa koneeltasi löytyvät kielialuuet suomeksi
        for (Locale locale: Locale.getAvailableLocales()) {
            System.out.println(locale.getDisplayName(suomi));
        }








    }
}
