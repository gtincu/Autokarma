package pages;

import help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }
}
//date de pe alta pagina
//fisiere resource goale

