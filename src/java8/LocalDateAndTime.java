package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateAndTime {
    public static void main(String[] args) {

//        Date date = new Date();
//        System.out.println(date);
//
//        System.out.println(System.currentTimeMillis());
//
//        Date date1 = new Date(System.currentTimeMillis());
//        System.out.println(date1);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dateTimeFormatter.format(localDate));

        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());

        System.out.println(localDate.plusDays(3));
        System.out.println(localDate.minusDays(3));

        System.out.println(localDate.getEra());
        System.out.println(localDate.getChronology());

        ZoneId zoneId = ZoneId.of("Asia/Karachi");

        LocalDate localDate1 = LocalDate.now(zoneId);
        System.out.println(localDate1);

        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDate2 = LocalDateTime.of(2021,12, 3,12,10);
        LocalDateTime localDate3 = LocalDateTime.of(2022,12,3,12,10);

        Duration duration = Duration.between(localDate2,localDate3);
        System.out.println(duration);

        LocalDate localDate4 = LocalDate.of(2020,1,1);
        LocalDate localDate5 = LocalDate.now();
        Period period = Period.between(localDate4,localDate5);
        System.out.println(period);

    }
}
