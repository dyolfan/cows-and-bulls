package com.kputimcevs.bullsandcows;

import java.util.Map;

import static com.kputimcevs.bullsandcows.ValueChecker.BULLS;
import static com.kputimcevs.bullsandcows.ValueChecker.COW;

public class InputDecoder {
    public static void showResult(Map<String, Integer> resultMap) {
        if (resultMap == null) {
            System.out.println("Congratulation you guessed!");
        } else {
            System.out.println("Result:");
            System.out.println("Cows: " + resultMap.get(COW));
            System.out.println("Bulls: " + resultMap.get(BULLS));
        }
    }
}
