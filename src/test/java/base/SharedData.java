package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import propertyUtility.PropertyFile;

import java.time.Duration;

public class SharedData {
    public WebDriver driver;

    public void initiateDriver(){
        PropertyFile driverResource = new PropertyFile("/driverData/driverResource");
        System.setProperty(driverResource.getValue("driverBrowser"),driverResource.getValue("location"));
        driver = new ChromeDriver();
        driver.get(driverResource.getValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void quitBrowser(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

//    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mufa\\Desktop\\Automation\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://www.autokarma.ro/");
//        driver.manage().window().maximize();
//    }
//
//
//    @After
//    public void tearDown() {
//        driver.quit();
//    }
}
