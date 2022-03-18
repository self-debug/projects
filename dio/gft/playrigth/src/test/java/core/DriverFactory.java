package core;

import com.microsoft.playwright.*;

public class DriverFactory{

    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext browserContext;
    private static Page page;


    public static Page web(){
        if(page == null){
            browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
            browserContext = browser.newContext();
            page = browser.newPage();
        }
        return page;
    }

    public static void tearDown(){
        browser.close();
        browser = null;
    }



}
