package Eclipse_training.dempo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdown {
	public static WebDriver driver;
	public static void Initiate() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void Initiateapp() throws InterruptedException {
		driver.get("https://trytestingthis.netlify.app");

		//To select an option from dropdown

		WebElement dd= driver.findElement(By.id("option"));
		Select selectelement = new Select(dd); //creating an obj for select cls with the webele

		Thread.sleep(2000);
		selectelement.selectByIndex(1);
		Thread.sleep(2000);
		selectelement.selectByValue("Option 2");
		Thread.sleep(2000);
		selectelement.selectByVisibleText("Option 3");

		Thread.sleep(2000);

//		//To store the dropdown options in a list
//        List <WebElement> Alloptions = driver.findElements(By.id("option"));
//        
//        for(WebElement option : Alloptions) {
//        	System.out.println(option.getText());
//        	if(option.getText().equalsIgnoreCase("option 2")) {
//        		option.click();
//        	}
        }

	
	public static void main(String[] args) throws InterruptedException {

		Initiate();
		Initiateapp();
	}
}
