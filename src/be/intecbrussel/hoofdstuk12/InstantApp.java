package be.intecbrussel.hoofdstuk12;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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

        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDate);
        System.out.println(nowTime);
        System.out.println(nowDateTime);

        LocalDate otherDate = LocalDate.of(2020, 12, 4);
        LocalTime otherTime = LocalTime.of(12, 40, 33);
        LocalDateTime otherDateTime = LocalDateTime.of(otherDate, otherTime);
        System.out.println(otherDate);
        System.out.println(otherTime);
        System.out.println(otherDateTime);
    }
}
