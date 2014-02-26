package org.adscale;

import static org.junit.Assert.assertEquals;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import org.junit.Ignore;
import org.junit.Test;

public class App_Test {

    public static final String DOMAIN = "http://localhost:8080/";

    public static final String LESTER_ADD = DOMAIN + "lester-add/add?";

    WebClient webClient = new WebClient();

    @Test
    public void sum() throws Exception {
        int i1 = 2;
        String s1 = i1 + "";
        int i2 = 7;
        String s2 = i2 + "";
        Page page = webClient.getPage(LESTER_ADD + "i=" + s1 + "&i=" + s2);
        String sum = page.getWebResponse().getContentAsString();
        assertEquals(i1 + i2 + "", sum);
    }


    @Test
    public void reversePolishNotation() throws Exception {


    }
}
