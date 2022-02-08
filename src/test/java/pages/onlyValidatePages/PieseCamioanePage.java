package pages.onlyValidatePages;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class PieseCamioanePage extends BasePage {


    public PieseCamioanePage(WebDriver driver) {
     super(driver);
    }

    public void validateTitleAndGoBack() {
        elementMethods.validateTitleElement("Catalog piese camioane");
        driver.navigate().back();
    }

    public void validateTitle(){
        elementMethods.validateTitleElement("Catalog piese camioane");
    }
}
