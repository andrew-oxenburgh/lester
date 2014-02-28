package org.adscale.business;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReversePolishNotation_Test {

    ReversePolishNotation rpn;


    @Before
    public void before() {
        rpn = new ReversePolishNotation();
        rpn.setAdd(new Add());
    }


    @Test
    public void rpn_calcCorrectly() throws Exception {
        assertRpn("1,2,3,plus", 6);
        assertRpn("2,2,3,plus", 7);
    }


    @Test(expected = java.lang.NumberFormatException.class)
    public void rpn_positiveZero_throwsNFE() throws Exception {
        assertRpn("+0,plus", -1);
    }


    @Test(expected = java.lang.NumberFormatException.class)
    public void rpn_positiveOne_throwsNFE() throws Exception {
        rpn.reversePolishNotation("+1,plus");
    }


    @Test
    public void stringsToInts() throws Exception {
        assertStringsConvertsToInts(new String[] { "1", "2" }, new int[] { 1, 2 });
        assertStringsConvertsToInts(new String[] { "1", "2", "7" }, new int[] { 1, 2, 7 });
        assertStringsConvertsToInts(new String[] { "1" }, new int[] { 1 });
        assertStringsConvertsToInts(new String[] { }, new int[] { });
    }


    private void assertRpn(String formula, int expected) {
        assertEquals(expected, rpn.reversePolishNotation(formula));
    }


    private void assertStringsConvertsToInts(String[] input, int[] expected) {
        int[] ints = new ReversePolishNotation().stringToInts(input);
        assertArrayEquals(expected, ints);
    }

}
