package com.kputimcevs.bullsandcows;

import java.util.HashMap;
import java.util.Map;

public class ValueChecker {
    public static final String BULLS_EYE = "Bulls-eye";
    public static final String BULLS = "bull";
    public static final String COW = "cow";

    public Map<String, Integer> checkInput(String code, String value) {
        char[] codeCharsArray = code.toCharArray();
        char[] charsArray = value.toCharArray();
        if (code.equals(value)) {
            return null;
        }

        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put(BULLS, 0);
        resultMap.put(COW, 0);

        for (int i = 0; i < charsArray.length; i++) {
            char valueChar = charsArray[i];
            int codeCharacterIndex = code.indexOf(valueChar);
            if (codeCharacterIndex >= 0) {
                if (codeCharsArray[i] == valueChar) {
                    Integer resultValue = resultMap.get(BULLS);
                    resultMap.put(BULLS, resultValue + 1);
                } else {
                    Integer resultValue = resultMap.get(COW);
                    resultMap.put(COW, resultValue + 1);
                }
            }
        }

        return resultMap;
    }
}
