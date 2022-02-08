package pages.onlyValidatePages;

import help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class AntigelPage extends BasePage {


    public AntigelPage(WebDriver driver){
        super(driver);
    }

    public void validateTitle(){
        elementMethods.validateTitleElement("Autokarma - Catalog piese universale - Antigel");
    }

}
