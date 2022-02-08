package pages.onlyValidatePages;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class PieseAutobuzePage extends BasePage {


    public PieseAutobuzePage(WebDriver driver) {
        super(driver);
    }

    public void validateTitleAndGoBack(){
        elementMethods.validateTitleElement("Catalog piese autobuze");
        driver.navigate().back();

    }
    public void validateTitle(){
        elementMethods.validateTitleElement("Catalog piese autobuze");
    }
}
