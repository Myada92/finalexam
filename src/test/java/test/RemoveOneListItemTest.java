package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.RemoveOneListItem;
import util.BrowserFactory;

public class RemoveOneListItemTest {
	WebDriver driver;
	
	@Test
	public void TestRemoveAllButton() {
		
		driver = BrowserFactory.init();

		RemoveOneListItem removeOneListItem = PageFactory.initElements(driver, RemoveOneListItem.class);
		removeOneListItem.remove_single_list();
		removeOneListItem.remove_button_function();
		removeOneListItem.validateSingleItemCanBeRemoved();
	}
}
