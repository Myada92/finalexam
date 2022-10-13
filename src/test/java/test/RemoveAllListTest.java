package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.RemoveAllList;
import util.BrowserFactory;

public class RemoveAllListTest {
	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToRemoveAllLIstItems() {
		driver = BrowserFactory.init();
		RemoveAllList removeAllList = PageFactory.initElements(driver, RemoveAllList.class);
		removeAllList.click_on_toggle_all();
		removeAllList.remove_button_function();
		removeAllList.validateUserShouldBeAbleToRemoveAllButtons();
		
		
	}

}
