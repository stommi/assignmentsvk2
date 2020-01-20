package kansainvalistaminenI18n;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class tehtava4 {
    public static void main(String[] args) throws ParseException {
        LocalDate tanaan = LocalDate.now();
        LocalDate testi = LocalDate.of(2020, 1, 1);

        System.out.println(tanaan);

        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(df.format(tanaan)); // 2018-01-01

        df = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(df.format(tanaan.atStartOfDay()));

        df = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(df.format(tanaan));

        System.out.println(df.format(testi));

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(new Date());
        Date date = format.parse("2020-01-20");
        System.out.println(date);

        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formattedDate = formatter.format(LocalDate.now());
        System.out.println(formattedDate);


        //http://tutorials.jenkov.com/java-internationalization/simpledateformat.html
        System.out.println("************");

        Locale suomi = new Locale("fi", "FI");
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(suomi);

        //long format:
        String pattern = "EEEEE dd MMMMM yyyy HH:mm:ss.SSSZ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, dateFormatSymbols);

        String date1 = simpleDateFormat.format(new Date());
        System.out.println(date1);

        //paivays ja kello lyhyessä muodossa
        String pattern2 = "EE dd.MM.yyyy HH:mm";
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2, dateFormatSymbols);

        String date2 = simpleDateFormat2.format(new Date());
        System.out.println(date2);


        //uk style
        Locale uk = new Locale("en", "GB");
        DateFormatSymbols dateFormatSymbolsUk = new DateFormatSymbols(uk);

        String pattern3 = "EEEEE dd MMMMM yyyy HH:mm:ss.SSSZ";
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(pattern3, dateFormatSymbolsUk);

        String date3 = simpleDateFormat3.format(new Date());
        System.out.println(date3);

    }
}
