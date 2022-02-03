package pages.onlyValidatePages;

import help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PieseMotocicletePage {
    public WebDriver driver;
    public ElementMethods elementMethods;

    public PieseMotocicletePage(WebDriver driver) {
        this.driver=driver;
        this.elementMethods=new ElementMethods(driver);
        PageFactory.initElements(driver,this);
    }

    public void validateTitleAndGoBack(){
        elementMethods.validateTitleElement("Catalog piese motociclete");
        driver.navigate().back();
    }

    public void validateTitle(){
        elementMethods.validateTitleElement("Catalog piese motociclete");
    }


}
