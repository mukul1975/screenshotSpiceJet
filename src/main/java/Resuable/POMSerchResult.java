package Resuable;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POMSerchResult {
	
	public WebDriver driver;
	public POMSerchResult(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='no_flights padding-left-15']")
	WebElement flightmsg;
	public void flightmsgvalided()
	{
		Assert.assertTrue(flightmsg.getText().contains("Sorry, no fares available for this date. Please select another date and try again."));	
	}
	
	@FindBy(xpath="//goingnextday//a[@class='buttonN btn-small'][contains(text(),'Next Day')]")
	WebElement nextday;
	public void serchnextday()
	{
		nextday.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Add-ons')]")
	WebElement addon;
	public void movetoaddon() throws InterruptedException
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(addon).build().perform();
		Thread.sleep(4000);
		
	}
	@FindBy(xpath="//a[contains(text(),'Visa Services')]")
	WebElement visa;
	public void clickonvisa()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(visa).click().build().perform();
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Gift Card')]")
	WebElement giftcard;
	public void clickongiftcard()
	{
		giftcard.click();
	}
	
	public void movetonextpage()
	{
		Set<String>win=driver.getWindowHandles();
		Iterator<String>it=win.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		
	}
	
	
	
	
}
