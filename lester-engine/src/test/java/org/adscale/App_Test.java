package org.adscale;

import static org.junit.Assert.assertEquals;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import org.junit.Ignore;
import org.junit.Test;

public class App_Test {

    WebClient webClient = new WebClient();

    @Test
    public void sum() throws Exception {
        String i1 = 2 + "";
        String i2 = 7 + "";
        Page page = webClient.getPage("http://localhost:8080/lester-add/add?i=" + i1 + "&i=" + i2);
        String sum = page.getWebResponse().getContentAsString();
        assertEquals(9 + "", sum);
    }
}
