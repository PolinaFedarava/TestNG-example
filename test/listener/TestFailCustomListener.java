package by.htp.test.listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import by.htp.test.driver.DriverSingletone;

public class TestFailCustomListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("!!!! onTestStart");
		Reporter.log("!!!! onTestStart");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("!!!!! onTestSuccess");
		Reporter.log("!!!!! onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("!!!! onTestFailure");
		Reporter.log("!!!! onTestFailure");
		
		takeScreenshot();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("!!!! onTestSkipped");
		Reporter.log("!!!! onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("!!!! onTestFailedButWithinSuccessPercentage");
		Reporter.log("!!!! onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("!!!! onStart");
		Reporter.log("!!!! onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("!!!! onFinish");
		Reporter.log("!!!! onFinish");
	}
	private void takeScreenshot(){
        File screenCapture = ((TakesScreenshot)DriverSingletone
                .getDriver())
                .getScreenshotAs(OutputType.FILE);
        try {
           FileUtils.copyFile(screenCapture, new File("D://Java_Fedorova/screen.png"));
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getLocalizedMessage());
        }
    }
}
