package tests.tests;

import base.SharedData;
import help.ElementMethods;
import org.junit.Test;
import pages.*;
import pages.onlyValidatePages.*;

public class ListaClaseAutovehiculeTest extends SharedData {
    public IndexPage indexPage;
    public ElementMethods elementMethods;
    public CatalogPieseAutoPage catalogPieseAutoPage;
    public PieseAutomobilePage pieseAutomobilePage;
    public PieseMotocicletePage pieseMotocicletePage;
    public PieseAutobuzePage pieseAutobuzePage;
    public PieseCamioanePage pieseCamioanePage;
    public PieseAgricolePage pieseAgricolePage;


    @Test
    public void clickListaClaseAutovehiculeTest(){
        indexPage = new IndexPage(driver);
        elementMethods = new ElementMethods(driver);
        catalogPieseAutoPage = new CatalogPieseAutoPage(driver);
        pieseAutomobilePage = new PieseAutomobilePage(driver);
        pieseMotocicletePage =new PieseMotocicletePage(driver);
        pieseAutobuzePage = new PieseAutobuzePage(driver);
        pieseCamioanePage =new PieseCamioanePage(driver);
        pieseAgricolePage =new PieseAgricolePage(driver);

        indexPage.clickCatalogPieseAuto();

        catalogPieseAutoPage.clickListaClaseAutovehiculeList(0);
        pieseAutomobilePage.validateTitleAndGoBack();
        catalogPieseAutoPage.clickListaClaseAutovehiculeList(1);
        pieseMotocicletePage.validateTitleAndGoBack();
        catalogPieseAutoPage.clickListaClaseAutovehiculeList(2);
        pieseAutobuzePage.validateTitleAndGoBack();
        catalogPieseAutoPage.clickListaClaseAutovehiculeList(3);
        pieseCamioanePage.validateTitleAndGoBack();
        catalogPieseAutoPage.clickListaClaseAutovehiculeList(4);
        pieseAgricolePage.validateTitleAndGoBack();


    }


}
