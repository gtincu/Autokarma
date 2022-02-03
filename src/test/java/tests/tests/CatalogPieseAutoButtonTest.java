package tests.tests;

import base.SharedData;
import help.ElementMethods;
import org.junit.Test;
import pages.*;
import pages.onlyValidatePages.*;

public class CatalogPieseAutoButtonTest extends SharedData {

    public ElementMethods elementMethods;
    public IndexPage indexPage;
    public PieseAutomobilePage pieseAutomobilePage;
    public PieseMotocicletePage pieseMotocicletePage;
    public PieseAutobuzePage pieseAutobuzePage;
    public PieseCamioanePage pieseCamioanePage;
    public PieseAgricolePage pieseAgricolePage;

    @Test
    public void catalogPieseTest() {
        elementMethods = new ElementMethods(driver);
        indexPage = new IndexPage(driver);
        pieseAutomobilePage = new PieseAutomobilePage(driver);
        pieseMotocicletePage =new PieseMotocicletePage(driver);
        pieseAutobuzePage =new PieseAutobuzePage(driver);
        pieseCamioanePage = new PieseCamioanePage(driver);
        pieseAgricolePage = new PieseAgricolePage(driver);

        indexPage.clickCatalogPieseAuto();
        indexPage.clickCatalogPieseAutoList(0);
        pieseAutomobilePage.validateTitle();
        indexPage.clickCatalogPieseAutoList(1);
        pieseMotocicletePage.validateTitle();
        indexPage.clickCatalogPieseAutoList(2);
        pieseAutobuzePage.validateTitle();
        indexPage.clickCatalogPieseAutoList(3);
        pieseCamioanePage.validateTitle();
        indexPage.clickCatalogPieseAutoList(4);
        pieseAgricolePage.validateTitle();

    }
}
