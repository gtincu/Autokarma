package pages.onlyValidatePages;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class PieseAgricolePage extends BasePage {


    public PieseAgricolePage(WebDriver driver){
        super(driver);
    }

    public void validateTitleAndGoBack(){
        elementMethods.validateTitleElement("Catalog piese utilaje agricole");
        driver.navigate().back();
    }

    public void validateTitle(){
        elementMethods.validateTitleElement("Catalog piese utilaje agricole");
    }
}
