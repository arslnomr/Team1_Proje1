package Runners;

import Utilities.GeneralWD;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/H_Resources_Position_Ö_A.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _ÖA_Parallel_Extent_Position extends AbstractTestNGCucumberTests {
    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
    public void beforeClass(String browser)
    {
        // borwser türünü GWD ye gönder
        GeneralWD.setThreadBrowserName(browser);
    }

    @AfterClass(alwaysRun = true) // rapor bittiği zaman
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("Windows User Name", System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name", "İsmet Temur");
        ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
    }
}
