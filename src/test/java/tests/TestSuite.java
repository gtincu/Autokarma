package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.tests.*;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CatalogPieseAutoButtonTest.class,
        AlegeMasinaTest.class,
        ListaClaseAutovehiculeTest.class,
        UniversaleButtonTest.class,
        ValidarePretCosNelogatTest.class,
        ValidarePretCosLogatTest.class
})

public class TestSuite {

}
