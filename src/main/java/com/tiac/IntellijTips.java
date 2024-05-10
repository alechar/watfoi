package com.tiac;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

public class IntellijTips {

    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).toList();


    }

    public static void timeBased(LocalDateTime dateTime) {
        System.out.println("Logic with: " + dateTime);
    }
}
