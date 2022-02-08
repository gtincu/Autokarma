package pages;

import help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UniversalePage {
        public WebDriver driver;
//        public IndexPage indexPage;
        public ElementMethods elementMethods;



        public UniversalePage(WebDriver driver){
                this.driver = driver;
//                this.indexPage=new IndexPage(driver);
                this.elementMethods= new ElementMethods(driver);
                PageFactory.initElements(driver, this);
        }

        public void validateTitle(){
                elementMethods.validateTitleElement("Autokarma - Catalog piese universale");
        }

}
