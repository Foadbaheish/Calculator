package testingFiles;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pageOpject.Assertions;
import pageOpject.mathematicalCalculations;
import support.parameters;

public class addTwoNumbers extends parameters{
	Assertions assertion= new Assertions();
	
	mathematicalCalculations Calculat = new mathematicalCalculations();
	@BeforeTest
	public void setup() {
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "myphone");
		caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+File.separator+
				"app"+File.separator+"calculator.apk");
	}
	
	@Test(description="Add Two Numbers Functionality")
	public void addNumbers() throws MalformedURLException, InterruptedException  {
		var appuimServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		driver = new AndroidDriver(appuimServerUrl , caps);


		Calculat.addTwoNumbers(); // == 9
        String addTwoNumbersResult = "9";
        assertion.FormulaAssertion(addTwoNumbersResult);
		Calculat.takeScreenshot();
		
		
	}
	@AfterTest
	public void myAfter() {
		//action.closeBrowser();
	}
}