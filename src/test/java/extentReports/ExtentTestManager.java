package extentReports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ExtentTestManager {
	
	static ThreadLocal<ExtentTest> testRport=new ThreadLocal<ExtentTest>();
	static ExtentReports extent=ExtentManager.getManager().getReporter();
	
	public static synchronized ExtentTest getTest() {
		return testRport.get();
	}
	
	public static void logInfo(String message) {
		testRport.get().info(message);
	}
	
	public static void logPass(String message) {
		testRport.get().pass(message);
	}
	
	public static void logFail(String message) {
		testRport.get().fail(message);
	}
	
	public static synchronized boolean addScreenShotsOnFailure() {
		ExtentManager.captureScreenShot();
		try {
			testRport.get().fail("<b>"+"<font color="+"red>"+"Screenshots of failure "+"</f.ont>"+"</b>",
			MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenshotName).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String failureLogg="SCENARIO FAILED";
		Markup m=MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
		testRport.get().log(Status.FAIL, m);
		return true;
	}
	
	public static synchronized boolean addScreenShots() {
		ExtentManager.captureScreenShot();
		try {
			testRport.get().info("<b>"+"<font color="+"red>"+"Screenshots of failure "+"</f.ont>"+"</b>",
			MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenshotName).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}
	
	public static synchronized ExtentTest starttest(String testName) {
		System.out.println("Test name: " +testName);
		return starttest(testName,"");
		
	}
	
	public static synchronized ExtentTest starttest(String testName, String desc) {
		ExtentTest test=extent.createTest(testName, desc);
		testRport.set(test);
		System.out.println(test);
		return test;
	}
}
