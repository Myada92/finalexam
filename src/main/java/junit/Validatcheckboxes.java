package junit;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validatcheckboxes {

	static WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\myada\\Selenium\\Final\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

//	@Test
//	public void validateToggleCheckBoxe() {
//
//		WebElement allToggleCheckBox = driver.findElement(By.xpath("/html/body/div[3]/input[3]"));
//		allToggleCheckBox.click();
//
//		status = allToggleCheckBox.isSelected();
//
//		// confirming what is there in status for learning purpose otherwise no need
//		System.out.println("Checking boolean status:" + status);
//
//		// checking condition is true or not.
//		if (status) {
//			System.out.println("allToggleCheckBox is selected sucessfully at profession.");
//
//		}
//
//		else {
//			System.out.println("allToggleCheckBox is not clicked at profession.");
//		}
//
//	}

//	@Test
//	public void removeSingleItem() {
//
//		WebElement toDoCheckBox = driver.findElement(By.xpath("//*[@id=\"todos-content\"]/form/ul/li[1]/input"));
//		toDoCheckBox.click();
//
//		WebElement removeCheckBox = driver.findElement(By.xpath("/html/body/div[3]/input[1]"));
//		removeCheckBox.click();
//	}
	@Test
	public void validateRemoveSingeItem() {
		WebElement toDoCheckBox = driver.findElement(By.xpath("//*[@id=\"todos-content\"]/form/ul/li[1]"));
		toDoCheckBox.click();

		WebElement removeCheckBox = driver.findElement(By.xpath("/html/body/div[3]/input[1]"));
		removeCheckBox.click();
		
		boolean status = toDoCheckBox.isSelected();
		System.out.println("Checking boolean status:" + status);
		if (status) {

			System.out.println(status+ "removed");

		}else

			System.out.println(status+ "not removed");

	}

//		 // validate YES button is selected or not
//		System.out.println("Checking boolean status:" + removeCheckBox); // for understandin perpuses if the status is
//																			// true or not
//		if (removeCheckBox) {// if it is true
//
//			System.out.println("remove checkBox has been selected succsessfully");
//		} else // if not
//
//			System.out.println("can not be selected");
//
//	}

//	@Test
//	public void Validate_that_all_list_item_could_be_removed() throws InterruptedException {
//
//		WebElement allToglleCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		allToglleCheckBox.click();
//		Thread.sleep(2000);
//		WebElement remove = driver.findElement(By.xpath("//input[@type='submit']"));
//		remove.click();
//		status = allToglleCheckBox.isSelected();
//		removeCheckBox = remove.isSelected();
//		System.out.println("Checking boolean status:" + status + removeCheckBox);
//
//		if (status) {
//			System.out.println("allToglleCheckBox is selected sucessfully at profession.");
//
//		} else if (removeCheckBox) {
//
//			System.out.println("remove checkBox has been selected succsessfully");
//		} else {
//			System.out.println("allToglleCheckBox can not be removed");

//
//		}
//
//	}

//	@AfterClass
//	public static void teardown() {
//		driver.close();
//		driver.quit();
//	}
}