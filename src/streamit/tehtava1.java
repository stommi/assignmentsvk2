package streamit;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class tehtava1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        List<String> viikonpaivat = new ArrayList<>();

        viikonpaivat.add("maanantai");
        viikonpaivat.add("tiistai");
        viikonpaivat.add("keskiviikko");
        viikonpaivat.add("torstai");
        viikonpaivat.add("perjantai");
        viikonpaivat.add("lauantai");
        viikonpaivat.add("sunnuntai");

        lista.add(5);
        lista.add(10);


        //filtteroi haluamat pois (ei sisällä!)
        String aakkoset = "abcdefghijklmnopqrstuvwxyz";
        IntStream virta = aakkoset.chars();
        String tulos = virta
                .mapToObj(i -> "" + (char) i)
                .filter(c -> !"az".contains(c)) //filter - filtteröi virtaa
                .map(String::toUpperCase) //map - muokkaa alkioita
                .collect(Collectors.joining(" "));
        System.out.println(tulos);

        //laskee keskiarvon listan luvuista
        double keskiarvo = lista.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println(keskiarvo);


        //TÄSTÄ ALAPUOLELTA ALKAA TEHTÄVÄ 1

        for (String paiva : viikonpaivat) {
            System.out.println(paiva);
        }

        //muokkaa kaikki merkkijonot isoiksi kirjaimiksi
        List<String> isolla = viikonpaivat.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        //tulostaa listan merkkijonot
        isolla.stream().forEach(System.out::println);

        //tulosta montako merkkijonoa listalla on
        System.out.println(isolla.stream().count());

        System.out.println("*******");

        //tulosta kaikki paitsi T-kirjaimella alkavat merkkijonot
        isolla.stream()
                .filter(paiva -> !paiva.startsWith("T"))
                .forEach(System.out::println);

        //lisää stream-käsittelyyn operaatio, joka järjestää merkkijonot
        //aakkosjärjestykseen ja tulosta ne
        isolla.stream()
                .sorted()
                .forEach(System.out::println);

        //Tulosta merkkijonot niiden pituuden mukaan järjestettynä

        System.out.println("********");

        isolla.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);


    }


}
