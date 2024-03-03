package appium;

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

public class appiumTesting extends parameters{
	Assertions assertion= new Assertions();
	mathematicalCalculations Calculat = new mathematicalCalculations();
	@BeforeTest
	public void setup() {
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "myphone");
		
		// only for mobile browsers 
//		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
//		caps.setCapability("chromedriverExecutable", System.getProperty("user.dir")+File.separator+
//				"driver"+File.separator+"chromedriver.exe");
				
		// only for mobile application 
		
		caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+File.separator+
				"app"+File.separator+"calculator.apk");
		
	}
	
//	@Test
//	public void myFirstTest() throws MalformedURLException {
//		
//		var appuimServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
//		driver = new AndroidDriver(appuimServerUrl , caps);
//		
//		driver.get("https://www.google.com/");
//		driver.findElement(By.id("XSqSsc")).sendKeys("facebook"+Keys.ENTER);
//	}
	
	
	@Test
	public void addNumbers() throws MalformedURLException {
		var appuimServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		driver = new AndroidDriver(appuimServerUrl , caps);
//		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
//		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
//		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
//		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
//		
//        Calculat.addTwoNumbers("6", "4"); // == 10
//        String addTwoNumbersResult = "10";
//        assertion.addTwoNumbersTrue(addTwoNumbersResult);
//		Calculat.takeScreenshot();
//		
//		Calculat.subtractionTwoNumbers("9", "5"); // == 4
//		String subtractionTwoNumbersResult = "4";
//        assertion.subtractionTwoNumbersTrue(subtractionTwoNumbersResult);
//		Calculat.takeScreenshot();
//
//		Calculat.multiplicationTwoNumbers("2", "2"); // == 4 
//		String multiplicationTwoNumbersResult = "4";
//        assertion.multiplicationTwoNumbersTrue(multiplicationTwoNumbersResult);
//		Calculat.takeScreenshot();
//
//		Calculat.SqrtNumber("9"); // == 3 
//		String SqrtNumberResult = "3";
//        assertion.SqrtNumbersTrue(SqrtNumberResult);
//		Calculat.takeScreenshot();
//		
//		Calculat.powerTwoNumbers("3","2"); // == 9
//		String powerTwoNumbersResult = "9";
//        assertion.powerTwoNumbersTrue(powerTwoNumbersResult);
//		Calculat.takeScreenshot();
//		
//		Calculat.FactorialNumbers("5"); // == 120
//		String FactorialNumbersResult = "120";
//        assertion.FactorialNumbersTrue(FactorialNumbersResult);
//		Calculat.takeScreenshot();
//		
//		
		

		
	
		
		
		
		
		
	}
	
	@AfterTest
	public void myAfter() {
	}

}