package org.adscale;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversePolishNotation {

    public int reversePolishNotation(String formula) {

        System.out.println("CALCING " + formula);

        String[] parts = formula.split(",");

        if (parts.length == 0) {
            return 0;
        }

        if (parts.length == 1) {
            return Integer.parseInt(parts[0]);
        }

        if (parts[parts.length - 1].equals("plus")) {
            parts = Arrays.copyOf(parts, parts.length - 1);
            return new Add().add(stringToInts(parts));
        }

        return -1;
    }

    public int[] stringToInts(String[] input) {
        int[] ints = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            ints[i] = Integer.parseInt(input[i]);
        }
        return ints;
    }

}
