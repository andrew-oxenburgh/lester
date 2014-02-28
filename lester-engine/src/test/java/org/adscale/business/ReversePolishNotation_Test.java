package org.adscale.business;

import static org.junit.Assert.assertArrayEquals;

import org.adscale.business.ReversePolishNotation;

import org.junit.Test;

public class ReversePolishNotation_Test {

    @Test
    public void stringsToInts() throws Exception {
        assertStringsConvertsToInts(new String[] { "1", "2" }, new int[] { 1, 2 });
        assertStringsConvertsToInts(new String[] { "1", "2", "7" }, new int[] { 1, 2, 7 });
        assertStringsConvertsToInts(new String[] { "1" }, new int[] { 1 });
        assertStringsConvertsToInts(new String[] { }, new int[] { });
    }


    private void assertStringsConvertsToInts(String[] input, int[] expected) {
        int[] ints = new ReversePolishNotation().stringToInts(input);
        assertArrayEquals(expected, ints);
    }

}
