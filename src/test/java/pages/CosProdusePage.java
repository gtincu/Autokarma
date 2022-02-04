package pages;

import help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

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
    @FindBy (xpath = "//*[@id='content']/div[3]/div/div/a")
    private WebElement continuareFinalizareELement;
    @FindBy (xpath = "//button[contains(text(),'Autentificare')]")
    private WebElement autentificareElement;
    @FindBy (xpath = "//*[@id='cart-totals']/div[1]/div[2]/b")
    private WebElement pretTotalLogatElement;
    @FindBy (css = "input[name='email']")
    private WebElement emailElement;
    @FindBy (css = "input[name='password']")
    private WebElement passwordElement;



    public String getPretTotal() {
        return pretTotalElement.getText();
    }

    public String getPretTotalLogat(){
        return pretTotalLogatElement.getText();
    }

    public void clickContinuareFinalizareButton(){
        elementMethods.scrollDown();
        continuareFinalizareELement.click();
    }

    public void clickAutentificareButton(){
        elementMethods.scrollDown();
        autentificareElement.click();
    }

    public void fillCredentialeLogin(HashMap<String,String> values){
        elementMethods.fillElement(emailElement,values.get("emailKey"));
        elementMethods.fillElement(passwordElement,values.get("parolaKey"));
    }

}
