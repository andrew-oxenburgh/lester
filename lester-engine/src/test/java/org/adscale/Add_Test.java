package org.adscale;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Add_Test {

    @Test
    public void testAdds() throws Exception {
        assertSum(4, 1, 3);
        assertSum(5, 2, 3);
        assertSum(9, 2, 3, 4);
        assertSum(21, 1, 2, 3, 4, 5, 6);
    }


    private void assertSum(int sum, int... i1) {
        assertEquals(sum, new Add().add(i1));
    }
}
