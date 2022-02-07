package tests.tests;

import base.Hooks;
import base.SharedData;
import com.aventstack.extentreports.Status;
import help.ElementMethods;
import org.junit.Assert;
import org.junit.Test;
import pages.CosProdusePage;
import pages.IndexPage;
import pages.UleiMotorPage;
import pages.UniversalePage;

public class AdaugaInCosSiValideazaPretTest extends Hooks {
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

        uleiMotorPage.selecteazaUleiuri(inputData.get("producatorKey"));
        uleiMotorPage.selecteazaUleiuri(inputData.get("tipKey"));
        uleiMotorPage.selecteazaUleiuri(inputData.get("vascozitateKey"));
        uleiMotorPage.selecteazaUleiuri(inputData.get("capacitateKey"));
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

        uleiMotorPage.selecteazaUleiuri(inputData.get("producatorKey2"));
        uleiMotorPage.selecteazaUleiuri(inputData.get("tipKey2"));
        uleiMotorPage.selecteazaUleiuri(inputData.get("vascozitateKey2"));
        uleiMotorPage.selecteazaUleiuri(inputData.get("capacitateKey2"));
        String pretListaText = uleiMotorPage.getPretLista();
        uleiMotorPage.clickVeziCosProduseElement();
        Assert.assertTrue(pretListaText.contains(cosProdusePage.getPretTotal()));
        report.logger.log(Status.PASS,"Selectare produs, adaugare in cos si validare pret nelogat");
    }
}
