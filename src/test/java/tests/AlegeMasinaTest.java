package tests;

import base.SharedData;
import org.junit.Test;
import pages.CatalogPieseAutoPage;
import pages.IndexPage;

public class AlegeMasinaTest extends SharedData {
    public IndexPage indexPage;
    public CatalogPieseAutoPage catalogPieseAutoPage;

    @Test
    public void cautaMasinaTest() {
        indexPage = new IndexPage(driver);
        catalogPieseAutoPage = new CatalogPieseAutoPage(driver);

        indexPage.clickCatalogPieseAuto();
        catalogPieseAutoPage.fillAlegeMasinaElement("Automobile\n", "Honda\n", "Accord\n", "Accord\n", "1.6\n");
        catalogPieseAutoPage.clickCautaMasina();
    }

    @Test
    public void stergeMasinaTest() {
        indexPage = new IndexPage(driver);
        catalogPieseAutoPage = new CatalogPieseAutoPage(driver);

        indexPage.clickCatalogPieseAuto();
        catalogPieseAutoPage.fillAlegeMasinaElement("Motociclete\n", "Ducati\n", "Superleggera\n", "Superleggera\n", "1299\n");
        catalogPieseAutoPage.clickStergeMasina();
    }
}
