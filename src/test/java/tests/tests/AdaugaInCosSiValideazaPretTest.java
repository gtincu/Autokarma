package tests.tests;

import base.SharedData;
import help.ElementMethods;
import org.junit.Assert;
import org.junit.Test;
import pages.CosProdusePage;
import pages.IndexPage;
import pages.UleiMotorPage;
import pages.UniversalePage;

public class AdaugaInCosSiValideazaPretTest extends SharedData {
    public IndexPage indexPage;
    public UleiMotorPage uleiMotorPage;
    public UniversalePage universalePage;
    public ElementMethods elementMethods;
    public CosProdusePage cosProdusePage;


    @Test
    public void adaugaInCosTest() {
        indexPage = new IndexPage(driver);
        uleiMotorPage = new UleiMotorPage(driver);
        universalePage = new UniversalePage(driver);
        elementMethods = new ElementMethods(driver);
        cosProdusePage = new CosProdusePage(driver);

        indexPage.clickUniversaleButton();
        universalePage.validateTitle();

        indexPage.clickUniversaleList(0);
        uleiMotorPage.validateTitle();

        uleiMotorPage.selecteazaUleiuri("Castrol");
        uleiMotorPage.selecteazaUleiuri("Pompe Duze");
        uleiMotorPage.selecteazaUleiuri("5w40");
        uleiMotorPage.selecteazaUleiuri("4 Litri");
        uleiMotorPage.clickAdaugaInCosButton();
        uleiMotorPage.validatePrice();
    }

    @Test
    public void valideazaPretCosTest(){
        indexPage = new IndexPage(driver);
        uleiMotorPage = new UleiMotorPage(driver);
        universalePage = new UniversalePage(driver);
        elementMethods = new ElementMethods(driver);
        cosProdusePage = new CosProdusePage(driver);


        indexPage.clickUniversaleButton();
        universalePage.validateTitle();

        indexPage.clickUniversaleList(0);
        uleiMotorPage.validateTitle();

        uleiMotorPage.selecteazaUleiuri("Aral");
        uleiMotorPage.selecteazaUleiuri("Pompe Duze");
        uleiMotorPage.selecteazaUleiuri("5w40");
        uleiMotorPage.selecteazaUleiuri("4 Litri");
        String pretListaText = uleiMotorPage.getPretLista();
        uleiMotorPage.clickVeziCosProduseElement();
        Assert.assertTrue(pretListaText.contains(cosProdusePage.getPretTotal()));
    }
}
