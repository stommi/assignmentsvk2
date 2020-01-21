package streamit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class tehtava4 {
    public static void main(String[] args) {
        final Random arpoja = new Random();

        List<Integer> numerot = IntStream
                .generate(() -> arpoja.nextInt(100))
                .limit(10)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());

        numerot.stream()
                .forEach(System.out::println);

        //summa
        int summa = numerot.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .sum();

        System.out.println("Summa on: " + summa);

        //lukujen keskiarvo
        double keskiarvo = numerot.stream()
                .mapToInt(s->Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("Keskiarvo on: " + keskiarvo);

        //suurin luku
        int suurin = numerot.stream()
                .mapToInt(s->Integer.valueOf(s))
                .max()
                .getAsInt();

        System.out.println("Suurin luku on: " + suurin);

        //pienin luku
        int pienin = numerot.stream()
                .mapToInt(s->Integer.valueOf(s))
                .min()
                .getAsInt();

        System.out.println("Pienin luku on: " + pienin);

        //parittomien summa

        int parittomienSumma = numerot.stream()
                .mapToInt(s->Integer.valueOf(s))
                .filter(luku -> luku % 2 !=0)
                .sum();

        System.out.println("Parittomien summa on: " + parittomienSumma);

        //luvut pilkulla eroteltuna yhdelle riville

        StringBuilder luvut = new StringBuilder();

        numerot.stream()
                .map(luku -> luku + ", ")
                .forEach(luvut::append);

        System.out.println(luvut);
        
    }

}

