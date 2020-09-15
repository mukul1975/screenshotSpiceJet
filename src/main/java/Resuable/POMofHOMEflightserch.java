package Resuable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMofHOMEflightserch {
	
	public WebDriver driver;
	
	public POMofHOMEflightserch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_rbtnl_Trip_1']")
	WebElement selecttrip;
	public void selecttrip1()
	{
		selecttrip.click();
	}
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")
	WebElement selectdeparturecity;
	public void selectdeparturecity1()
	{
		selectdeparturecity.click();
	}
	@FindBy(xpath="//a[@text='Kanpur (KNU)']")
	WebElement selectfromcity;
	public void selectfromcity1()
	{
		selectfromcity.click();
	}
	
	@FindBy(how=How.XPATH,using="(//a[@text='Jaipur (JAI)'] )[2]")
	WebElement destination;
	public void destinationcity()
	{
		destination.click();
	}
	
	@FindBy(xpath="//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div[@class='ui-datepicker-title']")
	WebElement selectmonth;
	@FindBy(xpath="//span[@class='ui-icon ui-icon-circle-triangle-e']")
	WebElement selectclick;
	public void selectmonthyear()
	{
		while(!selectmonth.getText().contains("October 2020"))
		{
			selectclick.click();
		}
	}
	
	By date=By.cssSelector(".ui-state-default");
	public void clickondate()
	{
		List<WebElement> dates=driver.findElements(date);
		for(int i=0;i<dates.size();i++)
		{
			String finaldate=driver.findElements(date).get(i).getText();
			if(finaldate.contains("21"))
			{
				driver.findElements(date).get(i).click();
				
			}
		}
	}
		
	@FindBy(xpath="//div[@class='picker-second']//button[@class='ui-datepicker-trigger']")
	WebElement Rdate;
	public void Returndate()
	{
		Rdate.click();
	}
	
	@FindBy(xpath="//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div[@class='ui-datepicker-title']")
	WebElement Rmonth;
	@FindBy(xpath="//span[@class='ui-icon ui-icon-circle-triangle-e']")
	WebElement clickonreturndate;
	public void returnmonthyeay()
	{
		while(!Rmonth.getText().contains("November 2020"))
		{
			clickonreturndate.click();
		}
	}
	
	By Rdates=By.cssSelector(".ui-state-default");
	public void returdate()
	{
		List<WebElement> rdate=driver.findElements(Rdates);
		for(int i=0;i<rdate.size();i++)
		{
			String finalReturndate=driver.findElements(Rdates).get(i).getText();
			if(finalReturndate.contains("20"))
			{
				driver.findElements(Rdates).get(i).click();
				
			}
		}
	}
	
	@FindBy(xpath="//div[@class='paxinfo']")
	WebElement selectpassenger;
	public void clickonselectpassenger1()
	{
		selectpassenger.click();
	}
	
	@FindBy(xpath="//select[@name='ctl00$mainContent$ddl_Adult']")
	WebElement selectadult;
	public void SelectAdult()
	{
		Select sc = new Select(selectadult);
		sc.selectByVisibleText("3");
	}
	
	@FindBy(xpath="//select[@name='ctl00$mainContent$ddl_Child']")
	WebElement selectchild;
	public void SelectChild()
	{
		Select sc = new Select(selectchild);
		sc.selectByVisibleText("4");
	}
	
	@FindBy(xpath="//select[@name='ctl00$mainContent$ddl_Infant']")
	WebElement selectinfant;
	public void SelectInfant()
	{
		Select sc = new Select(selectinfant);
		sc.selectByVisibleText("1");
	}
	
	@FindBy(xpath="//select[@name='ctl00$mainContent$DropDownListCurrency']")
	WebElement selectcurrency;
	public void SelectCurrency()
	{
		Select sc= new Select(selectcurrency);
		sc.selectByVisibleText("USD");
	}
	
	@FindBy(xpath="//input[@name='ctl00$mainContent$chk_friendsandfamily']")
	WebElement selectcheck;
	public void clickoncheckbox()
	{
		selectcheck.click();
		
	}
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_btn_FindFlights']")
	WebElement serch;
	public void flightserch()
	{
		serch.click();
	}
	
	}
	


