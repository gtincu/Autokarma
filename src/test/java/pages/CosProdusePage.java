package pages;

import help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CosProdusePage {
    public WebDriver driver;
    public ElementMethods elementMethods;

    public CosProdusePage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id='totaluri']/div[2]/div/div[1]/div[2]")
    private WebElement pretTotalElement;

    public String getPretTotal() {
        return pretTotalElement.getText();
    }

}
