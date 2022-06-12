package com.kputimcevs.bullsandcows;

import java.util.Random;

public class CodeGenerator {
    private final Random random = new Random();

    public Integer generateCode() {
        return random.nextInt(9999);
    }
}
