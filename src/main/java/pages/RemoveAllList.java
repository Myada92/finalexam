package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllList {
	WebDriver driver;
	public RemoveAllList(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/input[3]") WebElement TOGGLE_CHECKBOX;
	@FindBy(how=How.XPATH,using= "/html/body/div[3]/input[1]") WebElement REMOVE_BUTTON;


	public void click_on_toggle_all() {
		TOGGLE_CHECKBOX.click();
	}

	public void remove_button_function() {
		REMOVE_BUTTON.click();
	}
	
	public void validateUserShouldBeAbleToRemoveAllButtons() {
		 boolean status = TOGGLE_CHECKBOX.isEnabled();
			//
					// confirming what is there in status for learning purpose otherwise no need
					System.out.println("Checking boolean status:" + status);
			
					// checking condition is true or not.
					if (status) {
						System.out.println("ALL LIST ITEMS HAS BEEN REMOVED");
			
					}
			
					else {
						System.out.println("ALL LIST ITEMS CAN NOT BE REMOVED");
					}
			
				}
	}

