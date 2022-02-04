package tests.tests;

import base.Hooks;
import org.junit.Test;
import pages.CatalogPieseAutoPage;
import pages.IndexPage;

public class AlegeMasinaTest extends Hooks {
    public IndexPage indexPage;
    public CatalogPieseAutoPage catalogPieseAutoPage;

    @Test
    public void cautaMasinaTest() {
        indexPage = new IndexPage(driver);
        catalogPieseAutoPage = new CatalogPieseAutoPage(driver);

        indexPage.clickCatalogPieseAuto();
        catalogPieseAutoPage.fillAlegeMasinaElement(inputData.get("clasaKey"), inputData.get("marcaKey"), inputData.get("grupaKey"), inputData.get("modelKey"), inputData.get("motorKey"));
        catalogPieseAutoPage.clickCautaMasina();
    }

    @Test
    public void stergeMasinaTest() {
        indexPage = new IndexPage(driver);
        catalogPieseAutoPage = new CatalogPieseAutoPage(driver);

        indexPage.clickCatalogPieseAuto();
        catalogPieseAutoPage.fillAlegeMasinaElement(inputData.get("clasaKey2"),inputData.get( "marcaKey2"), inputData.get("grupaKey2"), inputData.get("modelKey2"), inputData.get("motorKey2"));
        catalogPieseAutoPage.clickStergeMasina();

    }
}
