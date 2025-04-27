package org.example;

public class AppTest {
    @Test
    public void openGooglePageTest() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\H A P P Y\\IdeaProjects\\test_ui\\src\\test\\resources\\webdriver\\chromedriver.exe"
        );

        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }
}