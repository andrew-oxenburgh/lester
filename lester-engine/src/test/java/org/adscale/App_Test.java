package org.adscale;

import static org.junit.Assert.assertEquals;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import org.junit.Ignore;
import org.junit.Test;

public class App_Test {

    WebClient webClient = new WebClient();

    @Test
    @Ignore
    public void sum() throws Exception {
        String url = "http://localhost:8090/lester-front-end/calc?calc=1,2,7,plus";
        System.out.println("url = " + url);
        Page page = webClient.getPage(url);
        String sum = page.getWebResponse().getContentAsString();
        assertEquals(1 + 2 + 7 + "", sum);
    }
}
