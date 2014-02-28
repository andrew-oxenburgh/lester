package org.adscale.business;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Add implements AddI {

    @Override
    public int add(int... first) {

        System.out.println("ADDING STUFF - " + ToStringBuilder.reflectionToString(first));

        int sum = 0;
        for (int i : first) {
            sum += i;
        }
        return sum;
    }


}
