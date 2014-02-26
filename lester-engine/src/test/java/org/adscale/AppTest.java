package org.adscale;

import static org.junit.Assert.*;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import org.junit.Test;

public class AppTest {
	@Test
	public void testApp() {
		assertTrue(true);
	}


    @Test
    public void testName() throws Exception {
        WebClient webClient = new WebClient();
        Page page = webClient.getPage("http://localhost:8080/lester-engine/helloGroovlet.groovy");
        assertEquals(true, page.isHtmlPage());
    }
}
