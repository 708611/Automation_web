package allocator;

import com.web.ind.*;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MainClass {
	
	private Properties properties;
	
	//create chrome instance
	WebDriver driver;

	public static void main(String[] args) {
	
		
		MainClass mc=new MainClass();
		mc.test();
				
				
	}
	private void test()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\indra\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch the application url
		driver.get("https://google.com");
		//get the corrent page the title 
		System.out.println(driver.getTitle());
	
		driver.quit();
	}

}
