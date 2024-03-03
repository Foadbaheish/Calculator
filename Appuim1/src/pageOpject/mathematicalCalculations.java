package pageOpject;

import java.io.File;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import support.parameters;

public class mathematicalCalculations extends parameters{
	public void addTwoNumbers() {
		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

		
		
	}
//	public void addTwoNumbers(String num1 , String num2) {
//		List<WebElement> Keys =  driver.findElements(By.className("android.widget.ImageButton"));
//		
//		for(int i =0 ; i<Keys.size(); i++) {
//			String resourceId =  Keys.get(i).getAttribute("resource-id");
//			
//			if(resourceId != null &&  resourceId.contains(num1)) {
//				Keys.get(i).click();
//				driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
//				break;
//			}
//			
//			else if(resourceId != null && resourceId.contains(num2)) {
//				Keys.get(i).click();
////				driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
//				
//				break;
//				
//			}
//			 
//			else if(!resourceId.contains("digit")) {
//				System.out.println("You send invalid data");
//				break;
//			}
//		}
//		
//		
//		
//
//		
//	}
	public void subtractionTwoNumbers() {
		driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

	}
//		List<WebElement> Keys =  driver.findElements(By.className("android.widget.ImageButton"));
//		
//		for(int i =0 ; i<Keys.size(); i++) {
//			String resourceId =  Keys.get(i).getAttribute("resource-id");
//			
//			if(resourceId != null &&  resourceId.contains(num1)) {
//				Keys.get(i).click();
//				driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
//				break;
//			}
//			
//			else if(resourceId != null && resourceId.contains(num2)) {
//				Keys.get(i).click();
//				driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
//				break;
//			}
//			 
//			else if(!resourceId.contains("digit")) {
//				System.out.println("You send invalid data");
//				break;
//			}
//		}
//	}
	public void multiplicationTwoNumbers() {
		driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

	}
//		List<WebElement> Keys =  driver.findElements(By.className("android.widget.ImageButton"));
//		
//		for(int i =0 ; i<Keys.size(); i++) {
//			String resourceId =  Keys.get(i).getAttribute("resource-id");
//			
//			if(resourceId != null &&  resourceId.contains(num1)) {
//				Keys.get(i).click();
//				driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
//				break;
//			}
//			
//			else if(resourceId != null && resourceId.contains(num2)) {
//				Keys.get(i).click();
//				driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
//				break;
//			}
//			 
//			else if(!resourceId.contains("digit")) {
//				System.out.println("You send invalid data");
//				break;
//			}
//		}
//	}
	public void SqrtNumber() {
		driver.findElement(By.id("com.google.android.calculator:id/op_sqrt")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

	}
//		List<WebElement> Keys =  driver.findElements(By.className("android.widget.ImageButton"));
//		
//		for(int i =0 ; i<Keys.size(); i++) {
//			String resourceId =  Keys.get(i).getAttribute("resource-id");
//			
//			if(resourceId != null &&  resourceId.contains(num1)) {
//				Keys.get(i).click();
//				driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
//				driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
//
//				break;
//			}
//			else if(!resourceId.contains("digit")) {
//				System.out.println("You send invalid data");
//				break;
//			
//				
//			}
//			 
//			
//			}
//		}
	public void powerTwoNumbers() {
		driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_pow")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	}
//		List<WebElement> Keys =  driver.findElements(By.className("android.widget.ImageButton"));
//		
//		for(int i =0 ; i<Keys.size(); i++) {
//			String resourceId =  Keys.get(i).getAttribute("resource-id");
//			
//			if(resourceId != null &&  resourceId.contains(num1)) {
//				Keys.get(i).click();
//				driver.findElement(By.id("com.google.android.calculator:id/op_pow")).click();
//				break;
//			}
//			
//			else if(resourceId != null && resourceId.contains(num2)) {
//				Keys.get(i).click();
//				driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
//				break;
//			}
//			 
//			else if(!resourceId.contains("digit")) {
//				System.out.println("You send invalid data");
//				break;
//			}
//		}
//	}
	public void FactorialNumbers() {
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_fact")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

//		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
//		List<WebElement> Keys =  driver.findElements(By.className("android.widget.ImageButton"));
//		
//		for(int i =0 ; i<Keys.size(); i++) {
//			String resourceId =  Keys.get(i).getAttribute("resource-id");
//			
//			if(resourceId != null &&  resourceId.contains(num1)) {
//				Keys.get(i).click();
//				driver.findElement(By.id("com.google.android.calculator:id/op_fact")).click();
//				driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
//
//				break;
//			}
//			else if(!resourceId.contains("digit")) {
//				System.out.println("You send invalid data");
//				break;
//			
//				
//			}
//			 
//			
//			}
		}
	
	
	
	
	
	public void takeScreenshot() {
		
		Date currentDate = new Date();
		String actualDate = currentDate.toString().replace(":", "_");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		
		
		File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationpath = System.getProperty("user.dir") + File.separator + "screenshots" + 
		File.separator +  actualDate + ".png";
		
        
        File finalDestination = new File(destinationpath);
        
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
