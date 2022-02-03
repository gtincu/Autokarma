package pages.onlyValidatePages;

import help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PieseCamioanePage {
    public WebDriver driver;
    public ElementMethods elementMethods;


    public PieseCamioanePage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    public void validateTitleAndGoBack() {
        elementMethods.validateTitleElement("Catalog piese camioane");
        driver.navigate().back();
    }

    public void validateTitle(){
        elementMethods.validateTitleElement("Catalog piese camioane");
    }
}
