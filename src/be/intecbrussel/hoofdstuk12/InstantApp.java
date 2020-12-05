package be.intecbrussel.hoofdstuk12;

import java.time.Instant;

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
    }
}
