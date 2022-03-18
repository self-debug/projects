package core;


import com.microsoft.playwright.Page;
import io.qameta.allure.Attachment;

import java.nio.file.Paths;


public class DriverManager extends DriverFactory {

    public static void irPara(String url) {
        web().navigate(url);
    }


    @Attachment(value = "Screenshot", type = "image/png")
    public static void takeScreenshot() {
        web().screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get("screenshot.png"))
                .setFullPage(true));
    }
}
