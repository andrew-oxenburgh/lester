package org.adscale.business;

import static org.junit.Assert.assertEquals;

import org.adscale.business.Add;
import org.adscale.business.ReversePolishNotation;

import org.junit.Test;

public class Add_Test {

    private Add add = new Add();

    private ReversePolishNotation rvp = new ReversePolishNotation();


    @Test
    public void testAdds() throws Exception {
        assertSum(4, 1, 3);
        assertSum(5, 2, 3);
        assertSum(9, 2, 3, 4);
        assertSum(21, 1, 2, 3, 4, 5, 6);
    }


    @Test
    public void reversePolishNotation_singleArg() throws Exception {
        assertEquals(3, reverse("3"));
        assertEquals(0, reverse("0"));
        assertEquals(1, reverse("1"));
    }


    @Test
    public void reversePolishNotation_twoArgs_1stZero() throws Exception {
        assertEquals(3, reverse("3,0,plus"));
        assertEquals(0, reverse("0,0,plus"));
        assertEquals(1, reverse("1,0,plus"));
        assertEquals(7, reverse("1,0,6,plus"));
    }


    @Test
    public void reversePolishNotation_twoArgs() throws Exception {
        assertEquals(4, reverse("3,1,plus"));
    }


    private int reverse(String formula) {
        return rvp.reversePolishNotation(formula);
    }



    private void assertSum(int sum, int... i1) {
        assertEquals(sum, add.add(i1));
    }
}
