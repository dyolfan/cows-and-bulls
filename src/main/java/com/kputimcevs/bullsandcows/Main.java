package com.kputimcevs.bullsandcows;

import java.util.Map;
import java.util.Scanner;

import static com.kputimcevs.bullsandcows.InputDecoder.showResult;

public class Main {
    public static void main(String[] args) {
        CodeGenerator generator = new CodeGenerator();
        String code = generator.generateCode().toString();
        System.out.println("Secret code: " + code);
        System.out.println("Try to guess code:");
        Map<String, Integer> result = Map.of();
        do {
            System.out.println("Your input:");
            Scanner scanner = new Scanner(System.in);
            String value = scanner.next();
            ValueChecker checker = new ValueChecker();
            result = checker.checkInput(code, value);
            showResult(result);
        } while (result != null);
    }
}
