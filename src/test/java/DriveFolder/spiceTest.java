package DriveFolder;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Resuable.POMSerchResult;
import Resuable.POMgiftcardpage;
import Resuable.POMofHOMEflightserch;
import Resuable.browserdetails;
@Listeners(listener.class)
public class spiceTest extends browserdetails{
	public ExtentReports Report;
	@BeforeTest
	public void reporting()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter Reporter=new ExtentSparkReporter(path);
		Reporter.config().setDocumentTitle("SpicejetTest");
		Reporter.config().setReportName("AutomationTest");
		Report=new ExtentReports();
		Report.attachReporter(Reporter);
		Report.setSystemInfo("Tester", "SAIFUL");
		Report.setSystemInfo("Tester1", "MUKUL");
		
	}
	
	
	@Test
	public void spicerun() throws IOException, InterruptedException
	{
		ExtentTest test=Report.createTest("SPICEJET");
		driver=browser();
		driver.get(prob.getProperty("url"));
		test.pass("HOMEPAGE NAVIGATE SUCESSFULLY");
		Assert.assertTrue(driver.getTitle().contains("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets"));
		test.pass("HOMEPAGE VALIDATED SUCESSFULLY");
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.spicejet.com/"));
		test.pass("URL VALIDATED SUCESSFULLY");
		POMofHOMEflightserch FS=new POMofHOMEflightserch(driver);
		FS.maximize();
		test.pass("HOMEPAGE MAXIMIZE SUCESSFULLY");
		FS.selecttrip1();
		test.pass("CLICK ON TRIP SUCESSFULLY");
		FS.selectdeparturecity1();
		test.pass("CLICK ON DEPARTEDCITY SUCESSFULLY");
		FS.selectfromcity1();
		test.pass("SELECT DEPARTEDCITY SUCESSFULLY");
		FS.destinationcity();
		test.pass("SELECT DESTINATIONCITY SUCESSFULLY");
		FS.selectmonthyear();
		test.pass("SELECT MONTH/YEAR SUCESSFULLY");
		FS.clickondate();
		test.pass("SELECT DATE SUCESSFULLY");
		FS.Returndate();
		test.pass("CLICK ON RETURT SUCESSFULLY");
		FS.returnmonthyeay();
		test.pass("SELECT RETURN MONTH/YEAR SUCESSFULLY");
		FS.returdate();
		test.pass("SELECT RETURN DATE SUCESSFULLY");
		FS.clickonselectpassenger1();
		test.pass("CLICK ON NUMBER OF PASSENGER SUCESSFULLY");
		FS.SelectAdult();
		test.pass("CLICK ON NUMBER OF ADULT PASSENGER SUCESSFULLY");
		FS.SelectChild();
		test.pass("CLICK ON NUMBER OF CHILD PASSENGER SUCESSFULLY");
		FS.SelectInfant();
		test.pass("CLICK ON NUMBER OF INFANT PASSENGER SUCESSFULLY");
		FS.SelectCurrency();
		test.pass("SELECT CURRENCY SUCESSFULLY");
		FS.clickoncheckbox();
		test.pass("SELECT PASSENGER TYPE SUCESSFULLY");
		FS.flightserch();
		test.pass("FLIGHT SEARCH SUCESSFULLY");
		POMSerchResult psr=new POMSerchResult(driver);
		psr.flightmsgvalided();
		test.pass("VALIDATED FLIGHT SEARCH SUCESSFULLY");
		psr.serchnextday();
		test.pass("CHECK NEXT DAY FLIGHT SUCESSFULLY");
		psr.movetoaddon();
		test.pass("MOUSEOVER SUCESSFULLY");
		psr.clickonvisa();
		test.pass("CLICK ON VISA SUCESSFULLY");
		psr.clickongiftcard();
		test.pass("CLICK ON GIFTCARD SUCESSFULLY");
		psr.movetonextpage();
		test.pass("MOVE ON NEXTPAGE SUCESSFULLY");
		POMgiftcardpage pgc=new POMgiftcardpage(driver);
		pgc.egiftcard();
		test.pass("MOUSEOVER ON EGIFTCARD SUCESSFULLY");
		pgc.clickoneid();
		test.pass("CLICK ON EID SUCESSFULLY");
		pgc.returntoparentpage();
		test.pass("RETURN TO PARENTPAGE SUCESSFULLY");
		pgc.teardawn();
		test.pass("BROWSER CLOSED SUCESSFULLY");
		
		Report.flush();
	}
	
	

}
