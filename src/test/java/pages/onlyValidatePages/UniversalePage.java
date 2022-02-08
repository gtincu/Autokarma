package pages.onlyValidatePages;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class UniversalePage extends BasePage {

        public UniversalePage(WebDriver driver){
                super(driver);
        }


        public void validateTitle(){
                elementMethods.validateTitleElement("Autokarma - Catalog piese universale");
        }

}
