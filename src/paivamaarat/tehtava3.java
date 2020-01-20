package paivamaarat;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class tehtava3 {
    public static void main(String[] args) {
        //pvm oliot
        LocalDate tanaan = LocalDate.now();
        LocalDate testi = LocalDate.of(2018, 4, 13);


        System.out.println(tanaan);
        System.out.println(testi);

        //LocalDate valmis = LocalDate.of(2017, 12, 15);
        //LocalDate ekapäivä = LocalDate.parse("2017-12-18");
        //LocalDate eilen = LocalDate.now().minus(5);
        //LocalDate huomenna = LocalDate.now().plusDays(1);


        //2 kk kuluttua
        System.out.println(tanaan.plusMonths(2));
        System.out.println(testi.plusMonths(2));

        //ensi vuoden ensimmainen perjantai
        LocalDate firstFriday = LocalDate.of(2021, 1, 1);
        System.out.println(firstFriday.getDayOfWeek());


        firstFriday.getDayOfWeek();
        while (true) {
            if (firstFriday.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                break;
            } else {
                firstFriday.plusDays(1);
            }

            System.out.println(firstFriday);


        }
    }
}
