package com.tiac;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

public class IntellijTips {
    private static Logger logger = LoggerFactory.getLogger(IntellijTips.class);

    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).toList();


        User user = new User();


        user.sumAndSubtract(1, 2, true);


    }


    public static void method(String s) {

    }

    public static void timeBased(LocalDateTime dateTime) {
        System.out.println("Logic with: " + dateTime);
    }
}
