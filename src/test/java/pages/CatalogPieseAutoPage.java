package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CatalogPieseAutoPage extends BasePage{

    public CatalogPieseAutoPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id='input_carfilter_class_chosen']/div/div/input")
    private WebElement clasaElement;
    @FindBy(xpath = "//*[@id='input_carfilter_brand_chosen']/div/div/input")
    private WebElement marcaElement;
    @FindBy(xpath = "//*[@id='input_carfilter_group_chosen']/div/div/input")
    private WebElement grupaElement;
    @FindBy(xpath = "//*[@id='input_carfilter_model_chosen']/div/div/input")
    private WebElement modelElement;
    @FindBy(xpath = "//*[@id='input_carfilter_vehicle_chosen']/div/div/input")
    private WebElement motorElement;
    @FindBy(id = "button-carfilter")
    private WebElement cautaMasinaElement;
    @FindBy(id = "button-carreset")
    private WebElement stergeButton;
    @FindBy(xpath = "//section[@id='sidebar-main']/div/div/div")
    private List<WebElement> claseAutovehiculeList;


    public void fillAlegeMasinaElement(String clasa, String marca, String grupa, String model, String motor) {
        elementMethods.scrollByPixel(0,500);
        elementMethods.fillAlegeMasinaElement(clasaElement, clasa);
        elementMethods.fillAlegeMasinaElement(marcaElement, marca);
        elementMethods.fillAlegeMasinaElement(grupaElement, grupa);
        elementMethods.fillAlegeMasinaElement(modelElement, model);
        elementMethods.fillAlegeMasinaElement(motorElement, motor);

    }

    public void clickCautaMasina() {
        elementMethods.clickElement(cautaMasinaElement);
    }

    public void clickStergeMasina() {
        elementMethods.clickElement(stergeButton);
    }

    public void clickListaClaseAutovehiculeList(Integer value){
        claseAutovehiculeList.get(value).click();
        elementMethods.wait(300);
    }


}
