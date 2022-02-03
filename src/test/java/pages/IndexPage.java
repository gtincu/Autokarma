package pages;

import help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class IndexPage {
    public WebDriver driver;
    public ElementMethods elementMethods;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='catalog-piese-auto']")
    private WebElement catalogPieseAutoElement;
    @FindBy(xpath = "//div[@class='mega-col-inner']/ul/li/a")
    private List<WebElement> catalogPieseAutoHoverList;
    @FindBy(xpath = "//button[@class='btn btn-success notify_cookie-close']")
    private WebElement acceptCookiesButton;
    @FindBy (xpath = "//span[contains(text(),'Universale')]")
    private WebElement universaleElement;
    @FindBy(xpath = "//*[@id='bs-megamenu']/ul/li[4]/div/div/div/div/div/ul/li/a")
    private List<WebElement> universaleList;


    public void clickCatalogPieseAuto() {
        acceptCookiesButton.click();
        elementMethods.clickElement(catalogPieseAutoElement);
        elementMethods.validateTitleElement("AutoKarma Group - Catalog piese auto - autoturisme, autoutilitare, motociclete, autobuze, camioane, utilaje agricole");

    }

    public void clickCatalogPieseAutoList(Integer value) {
        elementMethods.hoverElement(catalogPieseAutoElement);
        catalogPieseAutoHoverList.get(value).click();
    }
    public void clickUniversaleList(Integer value) {
        elementMethods.hoverElement(universaleElement);
        universaleList.get(value).click();
    }


    public void clickUniversaleButton(){
        acceptCookiesButton.click();
        elementMethods.clickElement(universaleElement);

    }

}

