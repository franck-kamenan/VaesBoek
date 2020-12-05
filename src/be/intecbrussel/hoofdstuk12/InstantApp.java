package be.intecbrussel.hoofdstuk12;

import java.time.*;

public class InstantApp {

    public static void main(String[] args) {

        Instant now = Instant.now();
        Instant earlier = now.minusSeconds(30);
        Instant later = now.plusSeconds(20);
        System.out.println(now);
        System.out.println(earlier);
        System.out.println(later);
        System.out.println(now.isAfter(earlier));
        System.out.println(now.isBefore(later));

        System.out.println();

        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDate);
        System.out.println(nowTime);
        System.out.println(nowDateTime);

        System.out.println();

        LocalDate otherDate = LocalDate.of(2020, 12, 4);
        LocalTime otherTime = LocalTime.of(12, 40, 33);
        LocalDateTime otherDateTime = LocalDateTime.of(otherDate, otherTime);
        System.out.println(otherDate);
        System.out.println(otherTime);
        System.out.println(otherDateTime);

        System.out.println();

        ZoneId.systemDefault();
        ZoneId londonZone = ZoneId.of("Europe/London");
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");

        ZonedDateTime nowHere = ZonedDateTime.now();
        ZonedDateTime nowLondon = ZonedDateTime.now(londonZone);
        ZonedDateTime nowSydney = ZonedDateTime.now(sydneyZone);

        System.out.println(nowHere);
        System.out.println(nowLondon);
        System.out.println(nowSydney);

        System.out.println();

        Duration nowDuration = Duration.between(now, later);
        System.out.println(nowDuration.getSeconds());
        Period nowPeriod = Period.between(otherDate, nowDate);
        System.out.println(nowPeriod);
    }
}
