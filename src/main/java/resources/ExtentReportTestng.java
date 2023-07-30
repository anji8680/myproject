package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTestng {
	static ExtentReports extent;
	
	public static ExtentReports getreportObject() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path); 
		reporter.config().setReportName("Automation results");
		reporter.config().setDocumentTitle("TestResults");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA", "Anjaneya");
		return extent;
		
	}

}
