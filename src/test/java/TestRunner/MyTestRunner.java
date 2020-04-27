package TestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.Reporter;

import ProjectUtility.ConfigFileReader;
import ProjectUtility.GenerateExtentReport;
//import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		 monochrome = true,
    features = {
        "src/test/resources/Features"
    },
    glue = {
        "StepDefination"
    },
    tags = {
    		"@JSONResponseforfutureDate"
    })
public class MyTestRunner  {
	@AfterClass
	 public static void writeExtentReport() {
	 //Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		/*ConfigFileReader configReader =  new ConfigFileReader();
		String path ="./Config/extentConfig.xml";
		Reporter.loadXMLConfig(path);
		
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	     Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	     Reporter.setSystemInfo("Maven", "3.5.2");
	     Reporter.setSystemInfo("Java Version", "1.8.");
	 */
		GenerateExtentReport generateREport = new GenerateExtentReport();
		generateREport.setupExtendReport();
	}
	
}
