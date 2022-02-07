package base;

import extentUtility.ExtentReportTest;
import org.junit.After;
import org.junit.Before;
import propertyUtility.PropertyFile;

import java.util.HashMap;

public class Hooks extends SharedData{
    public HashMap<String,String> inputData;
    public ExtentReportTest report;

    @Before
    public void prepareEnvironment(){
        initiateDriver();

//        obtin numele testului care ruleaza
        String testName = this.getClass().getSimpleName();
//        incarc fisierul coresp testului
        PropertyFile testData = new PropertyFile("testData/" + testName + "Resource");
        inputData = testData.getAllValues();
        report = new ExtentReportTest(testName);
    }



    @After
    public void cleanEnvironment(){
        quitBrowser();
        report.generateReport();
    }
}
