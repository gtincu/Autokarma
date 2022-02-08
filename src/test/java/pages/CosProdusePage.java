package pages;

import help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class CosProdusePage extends BasePage{

    public CosProdusePage(WebDriver driver){
        super(driver);
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

    public String getPretTotalNelogat() {
        return pretTotalElement.getText();
    }

    public String getPretTotalLogat(){
        elementMethods.scrollByPixel(0,500);
        return pretTotalLogatElement.getText();
    }

    public void clickContinuareFinalizareButton(){
        elementMethods.scrollByPixel(0,500);
        continuareFinalizareELement.click();
    }

    public void clickAutentificareButton(){
        elementMethods.scrollByPixel(0,500);
        autentificareElement.click();
    }

    public void fillCredentialeLogin(HashMap<String,String> values){
        elementMethods.fillElement(emailElement,values.get("emailKey"));
        elementMethods.fillElement(passwordElement,values.get("parolaKey"));
    }

}
