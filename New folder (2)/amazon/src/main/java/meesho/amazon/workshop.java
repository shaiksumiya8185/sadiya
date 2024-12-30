package meesho.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class workshop {

	public static void main(String[] args)throws InterruptedException {
		// System.setProperty("webdriver.ChromeDriver();
		driver.get("http://www.apple.com/in/");
		Thread.sleep(4000);
		//scroll by
		//cClassname reference varaible = new classname();
		Actions actions=new Actions(driver);
		actions.scrollByAmount(0,3000).perform();
		//radio Button Click
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(6000);
		driver.findElement(By.name("sex")).click();
		WebElement maleRadiobutton=driver.findElement(By.xpath("//input[@value=Male]"));
		//syntax:if(condition){
		//body-SYSOUT
		//}
		//else{
		//SYSOUT
		//}
		if(maleRadiobutton.isSelected()) {
			System.out.println("display male radio button is selected");
		}else
		{
			System.out.println("display female&custom radio buttons are unselected");
			
		}
	}

}
