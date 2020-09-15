package Resuable;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class POMgiftcardpage {
	
	public WebDriver driver;
	
	public POMgiftcardpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//section[@class='top-bar-section']//span[@class='ng-binding'][contains(text(),'E-Gift card')]")
	WebElement mouseover;
	public void egiftcard()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(mouseover).build().perform();
	}
	
	@FindBy(how=How.XPATH,using="//section[@class='top-bar-section']//a[@class='ng-binding'][contains(text(),'Eid')]")
	WebElement eid;
	public void clickoneid()
	{
		eid.click();
	}
	
	public void returntoparentpage()
	{
		Set<String>win=driver.getWindowHandles();
		Iterator<String>it=win.iterator();
		String parent=it.next();
		driver.switchTo().window(parent);
		
	}
	
	public void teardawn()
	{
		driver.quit();
	}
	
	

}
