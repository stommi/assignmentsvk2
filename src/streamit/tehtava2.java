package streamit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class tehtava2 {
    public static void main(String[] args) {
        List<Henkilo> henkilot = new ArrayList<>();

        Henkilo h1 = new Henkilo("Jaska", 15);
        Henkilo h2 = new Henkilo("Jorma", 58);
        Henkilo h3 = new Henkilo("Nina", 26);

        henkilot.add(h1);
        henkilot.add(h2);
        henkilot.add(h3);

        //Tulosta kaikki henkilöt käyttäen stream operaatioita
        henkilot.stream().forEach(System.out::println);

        System.out.println("******");

        //Tulosta kaikkien henkilöiden nimet yhdellä rivillä, pilkuilla erotettuina
        String hlot = henkilot.stream()
                .map(h -> h.toString())
                .collect(Collectors.joining(",\n"));
        System.out.println(hlot);


        System.out.println("*****");
        //Tulosta yli 18.v nimet

        henkilot.stream()
                .sorted(Comparator.comparing(Henkilo::getIka))
                .forEach(System.out::println);

        System.out.println("*******");

        //Tulosta henkilöt nimen mukaan järjestettynä

        henkilot.stream()
                .sorted(Comparator.comparing(Henkilo::getNimi))
                .forEach(System.out::println);


    }
}
