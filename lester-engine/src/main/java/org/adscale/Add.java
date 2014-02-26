package org.adscale;

public class Add {

    public int add(int... first) {

        int sum = 0;
        for (int i : first) {
            sum += i;
        }
        return sum;
    }
}
