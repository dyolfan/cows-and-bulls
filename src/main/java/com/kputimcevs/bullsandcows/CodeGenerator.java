package com.kputimcevs.bullsandcows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CodeGenerator {
    private final Random random = new Random();

    public String generateCode() {
        List<Integer> list = new ArrayList<>();
        while (list.size() < 4) {
            int generatedValue = random.nextInt(9);
            boolean match = list.stream().anyMatch(value -> generatedValue == value);
            if (!match) {
                list.add(generatedValue);
            }
        }
        return list.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}
