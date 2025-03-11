package pojo;
import java.time.Duration;

import org.openqa.selenium.WebDriver();
public class LaunchBrowser {
	
		
		
		public static WebDriver openBrowser () {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naaptol.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		return driver;
		
		
		
		}
}
