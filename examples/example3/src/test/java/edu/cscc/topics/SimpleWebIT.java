package edu.cscc.topics;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class SimpleWebIT {
    @Test
    public void simpleWebSiteCheck() throws IOException {
        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);

        HtmlPage page = client.getPage("http://localhost:8999/index.html");
        Assert.assertEquals("Title text doesn't match expectations", "Example 3 - integration tests", page.getTitleText());
    }
}
