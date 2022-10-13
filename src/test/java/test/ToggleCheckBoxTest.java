package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.ToggleCheckbox;
import util.BrowserFactory;

public class ToggleCheckBoxTest {
	WebDriver driver;
	
	@Test
	public void TestFunctionalityofToggleCheckBox() {
		
		driver = BrowserFactory.init();
		
		ToggleCheckbox toggleCheckbox = PageFactory.initElements(driver, ToggleCheckbox.class);
		toggleCheckbox.checkingToggleAll();
		toggleCheckbox.validate_toggle_checkBox();

	}

}
