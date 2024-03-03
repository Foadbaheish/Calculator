package pageOpject;

import org.openqa.selenium.By;
import org.testng.Assert;

import support.parameters;

public class Assertions extends parameters {
	
	

	
	public void FormulaAssertion(String expectedText) {
		String actualText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.TextView")).getText();
		
		Assert.assertEquals(actualText, expectedText);
	}

}
