package pages.onlyValidatePages;

import help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class PieseAutomobilePage extends BasePage {


    public PieseAutomobilePage(WebDriver driver){
      super(driver);
    }

    public void validateTitleAndGoBack() {
        elementMethods.validateTitleElement("Catalog piese - autoturisme si autoutilitare");
        driver.navigate().back();
    }
    public void validateTitle(){
        elementMethods.validateTitleElement("Catalog piese - autoturisme si autoutilitare");
    }
}
