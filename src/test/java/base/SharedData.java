package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedData {
    public WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mufa\\Desktop\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.autokarma.ro/");
        driver.manage().window().maximize();
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
