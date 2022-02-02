package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UniversalePage {
        public WebDriver driver;
        public IndexPage indexPage;

        public void UniversalePage(){
                this.driver=driver;
                this.indexPage=new IndexPage(driver);
                PageFactory.initElements(driver, this);
        }



}
