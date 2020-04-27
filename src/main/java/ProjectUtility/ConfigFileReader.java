package ProjectUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigFileReader {
	public void getReportConfigPath() throws Throwable{
		/*String extentReportConfigPath = Properties.this
		if(extentReportConfigPath!= null) return extentReportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:extentReportConfigPath");*/		
		
		FileInputStream fis = new FileInputStream("Configuration.properties");
		   Properties properties = new Properties();
				properties.load(fis);
	
	}
}
