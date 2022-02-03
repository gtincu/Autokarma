package pages.onlyValidatePages;

import help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AntigelPage {
    public WebDriver driver;
    public ElementMethods elementMethods;

    public AntigelPage(WebDriver driver){
        this.driver=driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);


    }

    public void validateTitle(){
        elementMethods.validateTitleElement("Autokarma - Catalog piese universale - Antigel");
    }

}
