package tests.tests;

import base.SharedData;
import help.ElementMethods;
import org.junit.Test;
import pages.UniversalePage;
import pages.onlyValidatePages.AntigelPage;
import pages.IndexPage;
import pages.UleiMotorPage;

public class UniversaleButtonTest extends SharedData {

    public IndexPage indexPage;
    public ElementMethods elementMethods;
    public UleiMotorPage uleiMotorPage;
    public AntigelPage antigelPage;
    public UniversalePage universalePage;

    @Test
    public void clickUniversaleTest(){
        indexPage=new IndexPage(driver);
        elementMethods=new ElementMethods(driver);
        uleiMotorPage = new UleiMotorPage(driver);
        antigelPage = new AntigelPage(driver);
        universalePage = new UniversalePage(driver);


        indexPage.clickUniversaleButton();
        universalePage.validateTitle();

        indexPage.clickUniversaleList(0);
        uleiMotorPage.validateTitle();
        indexPage.clickUniversaleList(1);
        antigelPage.validateTitle();
        indexPage.clickUniversaleList(11);
        universalePage.validateTitle();





    }
}