package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	 private static ExtentReports extent;
	 
	 public ExtentReports getReporterObject() {
		 String path = System.getProperty("user.dir") + "\\reports\\index.html";
		 ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		 reporter.config().setReportName("E-commerce Web Automation Results");
		 reporter.config().setDocumentTitle("Test Results");
		 
		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Tester", "Reemo");
		 return extent;
	 }

}
