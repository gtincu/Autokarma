package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class UleiMotorPage extends BasePage{

    public UleiMotorPage(WebDriver driver){
        super(driver);
    }


    @FindBy(xpath = "//div[@class='bf-sliding-cont']/div/div/div/span/input")
    private List<WebElement> filtreListUleiuriElement;
    @FindBy(css = "input[value='Aplica']")
    private WebElement aplicaButton;
    @FindBy(css = "i[class='fa fa-cart-plus']")
    private WebElement adaugaInCosElement;
    @FindBy(xpath = "//*[@id='products']/div/div/div/div[3]/div/div/div[4]/div[1]/div/span")
    private WebElement pretListaElement;
    @FindBy(xpath = "//*[@id='cart-total']")
    private WebElement veziCosProduseElement1;
    @FindBy(xpath = "//*[@id='cart-total']")
    private WebElement veziCosProduseElement;
    @FindBy(css = "#cart > ul > li:nth-child(2) > div > div > div:nth-child(1) > a > span")
    private WebElement getVeziCosProduseElement2;

    public void selecteazaUleiuri(String ulei) {
        switch (ulei) {
            case "Aral":
                elementMethods.clickElement(filtreListUleiuriElement.get(0));
                break;
            case "Castrol":
                elementMethods.clickElement(filtreListUleiuriElement.get(3));
                break;
            case "Liqui Moly":
                elementMethods.clickElement(filtreListUleiuriElement.get(14));
                break;
            case "Total":
                elementMethods.clickElement(filtreListUleiuriElement.get(31));
                break;

            case "Valvoline":
                elementMethods.clickElement(filtreListUleiuriElement.get(34));
                break;
            case "Pompe Duze":
                elementMethods.clickElement(filtreListUleiuriElement.get(40));
                break;
            case "5w40":
                elementMethods.clickElement(filtreListUleiuriElement.get(59));
                break;
            case "4 Litri":
                elementMethods.clickElement(filtreListUleiuriElement.get(63));
                break;
            case "5 Litri":
                elementMethods.clickElement(filtreListUleiuriElement.get(64));
                break;

        }
    }

    public void clickAdaugaInCosButton() {
        elementMethods.clickElement(aplicaButton);
        elementMethods.wait(300);
        elementMethods.scrollByPixel(0,900);
        elementMethods.clickElement(adaugaInCosElement);
        elementMethods.wait(300);
    }

    public void validateTitle() {
        elementMethods.validateTitleElement("Autokarma - Catalog piese universale - Ulei motor");

    }

    public void clickVeziCosProduseElement () {
        elementMethods.hoverElement(veziCosProduseElement);
        veziCosProduseElement.click();
        getVeziCosProduseElement2.click();
    }

    public void validatePrice() {
        String actualString = pretListaElement.getText();
        String expectedString = veziCosProduseElement1.getText();
        Assert.assertTrue(expectedString.contains(actualString));
    }

        public String getPretLista() {
            elementMethods.clickElement(aplicaButton);
            elementMethods.scrollByPixel(0,2000);

            String x = pretListaElement.getText();
            elementMethods.clickElement(adaugaInCosElement);
        return x;
    }


}
