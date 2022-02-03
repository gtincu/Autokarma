package pages.onlyValidatePages;

import help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PieseAutomobilePage {
    public WebDriver driver;
    public ElementMethods elementMethods;

    public PieseAutomobilePage(WebDriver driver){
        this.driver = driver;
        this.elementMethods= new ElementMethods(driver);
        PageFactory.initElements(driver,this);
    }

    public void validateTitleAndGoBack() {
        elementMethods.validateTitleElement("Catalog piese - autoturisme si autoutilitare");
        driver.navigate().back();
    }
    public void validateTitle(){
        elementMethods.validateTitleElement("Catalog piese - autoturisme si autoutilitare");
    }
}
