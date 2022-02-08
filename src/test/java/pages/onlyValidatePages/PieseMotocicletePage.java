package pages.onlyValidatePages;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class PieseMotocicletePage extends BasePage {

    public PieseMotocicletePage(WebDriver driver) {
      super(driver);
    }

    public void validateTitleAndGoBack(){
        elementMethods.validateTitleElement("Catalog piese motociclete");
        driver.navigate().back();
    }

    public void validateTitle(){
        elementMethods.validateTitleElement("Catalog piese motociclete");
    }


}
