package org.adscale;

import static org.junit.Assert.assertEquals;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import org.junit.Test;

public class App_Test {

    public static final String DOMAIN = "http://localhost:8090/";

    public static final String LESTER_ADD = DOMAIN + "lester-front-end/calc?";

    WebClient webClient = new WebClient();


    @Test
    public void sum() throws Exception {
        String url = LESTER_ADD + "calc=1,2,plus";
        System.out.println("url = " + url);
        Page page = webClient.getPage(url);
        String sum = page.getWebResponse().getContentAsString();
        assertEquals(1 + 2 + "", sum);
    }
}
