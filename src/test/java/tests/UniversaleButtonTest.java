package tests;

import base.SharedData;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.IndexPage;

public class UniversaleButtonTest extends SharedData {
    public IndexPage indexPage;

    @Test
    public void clickUniversaleTest(){
        indexPage=new IndexPage(driver);

        indexPage.clickUniversaleList(0);
    }
}
