package BusinessComponents;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import elements.XpathElement;

import elements.XpathElement;

public class BusinessLogic {
	
	public static WebDriver driver;
	public static File file;
	
	//Launch Application
	public static void BrowserLaunch() {
	System.out.println("BrowserLaunch");
	System.out.println("Test");
	System.setProperty("webdriver.chrome.driver", "C:\\dmw_javascript_wdio_automation\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");
	 driver =new ChromeDriver();
	 //maximize window
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	//Application opening
	driver.get("https://www.wyndhamhotels.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	public static void takeScreenShot(int n)
	{
		System.out.println("takeScreenShot");
		try {
		 file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 FileUtils.copyFile(file, new File("C:/Users/indra/eclipse-workspace/AutomationProject/ObjectEvidence/screenshot"+n+".png"));
		}
		catch(Exception e)
		{
			
		}
	}
	
	public static void logIn()
	{
	   System.out.println("logIn");
	   driver.findElement(By.xpath(XpathElement.login)).click();
	   driver.findElement(By.xpath(XpathElement.usernamefield)).sendKeys(XpathElement.username);
	   driver.findElement(By.xpath(XpathElement.passwordfield)).sendKeys(XpathElement.password);
	   driver.findElement(By.xpath(XpathElement.loginpagebutton)).click();
	   
	 
	   
	   
	}
	public static void selectLocation()
	{
		System.out.println("selectLocation");
		driver.findElement(By.xpath(XpathElement.locationXpath)).sendKeys(XpathElement.location);
		
	}
	
	public static void selectCheckInDate()
	{
		System.out.println("selectCheckInDate");
	   driver.findElement(By.xpath(XpathElement.checkinXpath)).click();	
	}
	
	public static void SearchButton()
	{
		System.out.println("SearchButton");
		try {
		driver.findElement(By.xpath(XpathElement.searchButton)).click();
		Thread.sleep(10000);
		}
		catch(Exception e)
		{
			
		}
	}
	public static void selectDistance()
	{
		System.out.println("selectDistance");
		try {
		Select dist=new Select(driver.findElement(By.xpath(XpathElement.distance)));
		dist.selectByVisibleText(XpathElement.distanceValue);
		Thread.sleep(10000);
		
	}
	catch(Exception e)
	{
		
	}
	}
	public static void selectLanguage()
	{try {
		
		Thread.sleep(5000);
		System.out.println("5000");
		System.out.println("Select region");
		driver.findElement(By.xpath(XpathElement.LocationDesti)).click();
		System.out.println("5000");
		driver.findElement(By.xpath(XpathElement.destination)).click();
		System.out.println("5000");
		
		WebElement dropdowns = driver.findElement(By.xpath(XpathElement.region));
		System.out.println("dropdowns");
	    Select ll = new Select(dropdowns);	    
	    List<WebElement> allProduct = driver.findElements(By.xpath("//select[contains(@id,'dest-region')]//option"));
	    System.out.println(allProduct.size());
	    for( WebElement product : allProduct){
	    	Thread.sleep(2000);
	    System.out.println(product.getText());
	    ll.selectByVisibleText(product.getText());	
	    }
	}
	catch(Exception e)
	{
	   e.printStackTrace();
	}
	}
	public static void selectHotel()
	{
		System.out.println("selectHotel");
		driver.findElement(By.xpath(XpathElement.select1sthotel)).click();
		
	}
    public static void Join()
    {
    	System.out.println("Join");
    	try {
    		try {
    		driver.findElement(By.xpath(XpathElement.joinButton)).click();;
    		Thread.sleep(3000);
    		driver.findElement(By.xpath(XpathElement.fname)).sendKeys(XpathElement.fistNameValue);
    		driver.findElement(By.xpath(XpathElement.lnmae)).sendKeys(XpathElement.lastNameValue);
    		driver.findElement(By.xpath(XpathElement.emailAddress)).sendKeys(XpathElement.emailValue);
    		driver.findElement(By.xpath(XpathElement.phoneNumber)).sendKeys(XpathElement.mobileno);
    		Thread.sleep(2000);
    		Select select= new Select(driver.findElement(By.xpath(XpathElement.selectCountry)));
    		select.selectByVisibleText(XpathElement.Country);
    		Thread.sleep(1000);
    		driver.findElement(By.xpath(XpathElement.city)).sendKeys(XpathElement.cityName);
    		Thread.sleep(2000);
    		System.out.println("2000");
    		driver.findElement(By.xpath(XpathElement.JoinNow)).click();
    		System.out.println("Click on Join button");
    		//driver.findElement(By.xpath(XpathElement.fname)).sendKeys(XpathElement.fistNameValue);
    		}
    		catch(Exception e)
    		{
    			
    		}
    		
    		
    	}
    	catch(Exception e)
    	{
    		
    	}
    }
}
